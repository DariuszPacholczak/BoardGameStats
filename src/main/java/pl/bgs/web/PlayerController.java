package pl.bgs.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.bgs.entity.Player;
import pl.bgs.repository.PlayerRepository;

@Controller
public class PlayerController {

	@Autowired
	private PlayerRepository playerRepository;

	@GetMapping(path = "/player/addplayer")
	public String showAddForm(Model model) {
		model.addAttribute("player", new Player());
		return "player/addplayer";
	}

	@PostMapping(path = "/player/addplayer")
	public String addPlayer(@Valid Player player, Model model) {
		playerRepository.save(player);
		return "redirect:playerlist";
	}

	@GetMapping(path = "/player/playerlist")
	public String showAllPlayers(Model model) {
		List<Player> players = playerRepository.findAll();
		model.addAttribute("players", players);
		return "player/playerlist";
	}

	@GetMapping(path = "/player/editplayer")
	public String showEditForm(@RequestParam(name = "id", required = true) long id, Model model) {
		Player player = playerRepository.findOne(id);
		model.addAttribute("player", player);
		return "player/editplayer";
	}

	@PostMapping(path = "/player/editplayer")
	public String editPlayer(@Valid Player player) {
		playerRepository.save(player);
		return "redirect:playerlist";
	}
	
	@RequestMapping("/player/remove")
	public String deleteGame(@RequestParam(name = "id", required = true) long id) {
		Player player = playerRepository.findOne(id);
		playerRepository.delete(player);
		return "redirect:playerlist";
	}
}
