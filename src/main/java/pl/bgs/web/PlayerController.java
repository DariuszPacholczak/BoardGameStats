package pl.bgs.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pl.bgs.entity.Player;
import pl.bgs.repository.PlayerRepository;

@Controller
public class PlayerController {

	@Autowired
	private PlayerRepository playerRepository;

	@GetMapping(path = "/player/addPlayer")
	public String showAddForm(Model model) {
		model.addAttribute("player", new Player());
		return "player/addPlayer";
	}

	@PostMapping(path = "/player/addPlayer")
	public String addPlayer(Player player, Model model) {
		playerRepository.save(player);
		return "redirect:playerList";
	}

	@GetMapping(path = "/player/playerList")
	public String showAllPlayers(Model model) {
		List<Player> players = playerRepository.findAll();
		model.addAttribute("players", players);
		return "player/playerList";
	}

	@GetMapping(path = "/player/editplayer")
	public String showEditForm(@RequestParam(name = "id", required = true) long id, Model model) {
		Player player = playerRepository.findOne(id);
		model.addAttribute("player", player);
		return "player/editPlayer";
	}

	@PostMapping(path = "/player/editPlayer")
	public String editPlayer(@Valid Player player) {
		playerRepository.save(player);
		return "redirect:playerList";
	}
}
