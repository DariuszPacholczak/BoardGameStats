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

import pl.bgs.entity.GameInstance;
import pl.bgs.entity.Player;
import pl.bgs.entity.PlayerInGame;
import pl.bgs.repository.GameInstanceRepository;
import pl.bgs.repository.PlayerInGameRepository;
import pl.bgs.repository.PlayerRepository;

@Controller
public class PlayerInGameController {
	
	@Autowired
	private PlayerInGameRepository playerInGameRepository;
	
	@Autowired
	private GameInstanceRepository gameInstanceRepository;
	
	@Autowired
	private PlayerRepository playerRepository;

	@GetMapping(path = "/playeringame/addingame")
	public String showAddForm(@RequestParam(name = "id", required = true) long id, Model model) {
		model.addAttribute("playerInGame", new PlayerInGame());
		model.addAttribute("gameInstanceId", id);
		return "playeringame/addingame";
	}

	@PostMapping(path = "/playeringame/addingame")
	public String addPlayerInGame(@Valid PlayerInGame playerInGame, BindingResult bresult, Model model) {
		if (bresult.hasErrors()) {
			return "playeringame/addingame";
		} else {
			playerInGameRepository.save(playerInGame);
			return "redirect:ingamelist?id="+playerInGame.getGameInstance().getId(); //?id=1
		}
	}

	@GetMapping(path = "/playeringame/ingamelist")
	public String showAllPlayersInGame(@RequestParam(name = "id", required = true) long id, Model model) {
		List<PlayerInGame> playerInGames = playerInGameRepository.findByGameInstanceId(id);
		model.addAttribute("playerInGames", playerInGames); 		
		model.addAttribute("gameInstanceId", id);
		return "playeringame/ingamelist";
	}

	@GetMapping(path = "/playeringame/editingame")
	public String showEditForm(@RequestParam(name = "id", required = true) long id, Model model) {
		PlayerInGame playerInGame = playerInGameRepository.findOne(id);
		model.addAttribute("playerInGame", playerInGame);
		return "playeringame/editingame";
	}

	@PostMapping(path = "/playeringame/editingame")
	public String editPlayerInGame(@Valid PlayerInGame playerInGame) {
		playerInGameRepository.save(playerInGame);
		return "redirect:ingamelist?id="+playerInGame.getGameInstance().getId();
	}

	@RequestMapping("/playeringame/remove")
	public String deletePlayerInGame(@RequestParam(name = "id", required = true) long id) {
		PlayerInGame playerInGame = playerInGameRepository.findOne(id);
		playerInGameRepository.delete(playerInGame);
		return "redirect:ingamelist?id="+playerInGame.getGameInstance().getId();
	}
	
	@ModelAttribute("GameInstance")
	public List<GameInstance> GameInstance() {
		return gameInstanceRepository.findAll();
	}
	
	@ModelAttribute("Player")
	public List<Player> Player() {
		return playerRepository.findAll();
	}
}
