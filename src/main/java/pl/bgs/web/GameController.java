package pl.bgs.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.bgs.entity.Game;
import pl.bgs.repository.GameRepository;

@Controller
public class GameController {

	@Autowired
	private GameRepository gameRepository;

	@GetMapping(path = "/game/addGame")
	public String showAddForm(Model model) {
		model.addAttribute("game", new Game());
		return "game/addGame";
	}

	@PostMapping(path = "/game/addGame")
	public String addGame(Game game, Model model) {
		gameRepository.save(game);
		return "redirect:gameList";
	}

	@GetMapping(path = "/game/gameList")
	public String showAllBooks(Model model) {
		List<Game> games = gameRepository.findAll();
		model.addAttribute("games", games);
		return "game/gameList";
	}

	@GetMapping(path = "/game/editGame")
	public String showEditForm(@RequestParam(name = "id", required = true) long id, Model model) {
		Game game = gameRepository.findOne(id);
		model.addAttribute("game", game);
		return "game/editGame";
	}

	@PostMapping(path = "/game/editGame")
	public String editBook(@Valid Game game) {
		gameRepository.save(game);
		return "redirect:gameList";
	}
}
