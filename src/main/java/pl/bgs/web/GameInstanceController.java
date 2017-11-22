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
import pl.bgs.entity.GameInstance;
import pl.bgs.entity.PlayerInGame;
import pl.bgs.repository.GameInstanceRepository;
import pl.bgs.repository.GameRepository;
import pl.bgs.repository.PlayerInGameRepository;

@Controller
public class GameInstanceController {
	
	@Autowired
	private GameInstanceRepository gameInstanceRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Autowired
	private PlayerInGameRepository playerInGameRepository;

	@GetMapping(path = "/gameinstance/addinstance")
	public String showAddForm(Model model) {
		model.addAttribute("gameInstance", new GameInstance());
		return "gameinstance/addinstance";
	}

	@PostMapping(path = "/gameinstance/addinstance")
	public String addGameInstance(@Valid GameInstance gameInstance, BindingResult bresult, Model model) {
		if (bresult.hasErrors()) {
			return "gameinstance/addinstance";
		} else {
			gameInstanceRepository.save(gameInstance);
			return "redirect:instancelist";
		}
	}

	@GetMapping(path = "/gameinstance/instancelist")
	public String showAllGameInstances(Model model) {
		List<GameInstance> gameInstances = gameInstanceRepository.findAll();
		model.addAttribute("gameInstances", gameInstances);
		return "gameinstance/instancelist";
	}

	@GetMapping(path = "/gameinstance/editinstance")
	public String showEditForm(@RequestParam(name = "id", required = true) long id, Model model) {
		GameInstance gameInstance = gameInstanceRepository.findOne(id);
		model.addAttribute("gameInstance", gameInstance);
		return "gameinstance/editinstance";
	}

	@PostMapping(path = "/gameinstance/editinstance")
	public String editGameInstance(@Valid GameInstance gameInstance) {
		gameInstanceRepository.save(gameInstance);
		return "redirect:instancelist";
	}

	@RequestMapping("/gameinstance/remove")
	public String deleteGameInstance(@RequestParam(name = "id", required = true) long id) {
		GameInstance gameInstance = gameInstanceRepository.findOne(id);
		gameInstanceRepository.delete(gameInstance);
		return "redirect:instancelist";
	}

	@ModelAttribute("Game")
	public List<Game> Game() {
		return gameRepository.findAll();
	}
	
	@ModelAttribute("PlayerInGame")
	public List<PlayerInGame> PlayerInGame() {
		return playerInGameRepository.findAll();
	}
}
