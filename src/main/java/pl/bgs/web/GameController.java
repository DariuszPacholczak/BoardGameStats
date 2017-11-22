package pl.bgs.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.bgs.entity.Game;
import pl.bgs.entity.GameCategory;
import pl.bgs.entity.MaxNumberOfPlayers;
import pl.bgs.entity.MaxPlayTime;
import pl.bgs.repository.GameCategoryRepository;
import pl.bgs.repository.GameRepository;
import pl.bgs.repository.MaxNumberOfPlayersRepository;
import pl.bgs.repository.MaxPlayTimeRepository;

@Controller
public class GameController {

	@Autowired
	private GameRepository gameRepository;
	@Autowired
	private MaxPlayTimeRepository maxPlayTimeRepository;
	@Autowired
	private MaxNumberOfPlayersRepository maxNumberOfPlayersRepository;
	@Autowired
	private GameCategoryRepository gameCategoryPlayersRepository;

	@GetMapping(path = "/game/addgame")
	public String showAddForm(Model model) {
		model.addAttribute("game", new Game());
		return "game/addgame";
	}

	@PostMapping(path = "/game/addgame")
	public String addGame(@Valid Game game, BindingResult bresult, Model model) {
		if (bresult.hasErrors()) {
			return "game/addgame";
		} else {
			gameRepository.save(game);
			return "redirect:gamelist";
		}
	}

	@GetMapping(path = "/game/gamelist")
	public String showAllGames(Model model) {
		List<Game> games = gameRepository.findAll();
		model.addAttribute("games", games);
		return "game/gamelist";
	}

	@GetMapping(path = "/game/editgame")
	public String showEditForm(@RequestParam(name = "id", required = true) long id, Model model) {
		Game game = gameRepository.findOne(id);
		model.addAttribute("game", game);
		return "game/editgame";
	}

	@PostMapping(path = "/game/editgame")
	public String editGame(@Valid Game game) {
		gameRepository.save(game);
		return "redirect:gamelist";
	}

	@RequestMapping("/game/remove")
	public String deleteGame(@RequestParam(name = "id", required = true) long id) {
		Game game = gameRepository.findOne(id);
		gameRepository.delete(game);
		return "redirect:gamelist";
	}

	@ModelAttribute("MaxPlayTime")
	public List<MaxPlayTime> MaxPlayTime() {
		return maxPlayTimeRepository.findAll();
	}

	@ModelAttribute("MaxNumberOfPlayers")
	public List<MaxNumberOfPlayers> MaxNumberOfPlayers() {
		return maxNumberOfPlayersRepository.findAll();
	}

	@ModelAttribute("GameCategory")
	public List<GameCategory> GameCategory() {
		return gameCategoryPlayersRepository.findAll();
	}
}
