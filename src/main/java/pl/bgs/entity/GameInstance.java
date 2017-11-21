package pl.bgs.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class GameInstance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date gameDate;
	
	@ManyToOne
	private Game game;
	
	@ManyToOne
	private PlayerInGame playerInGame;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getGameDate() {
		return gameDate;
	}

	public void setGameDate(Date gameDate) {
		this.gameDate = gameDate;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public PlayerInGame getPlayerInGame() {
		return playerInGame;
	}

	public void setPlayerInGame(PlayerInGame playerInGame) {
		this.playerInGame = playerInGame;
	}

	public GameInstance(Long id, Date gameDate, Game game, PlayerInGame playerInGame) {
		super();
		this.id = id;
		this.gameDate = gameDate;
		this.game = game;
		this.playerInGame = playerInGame;
	}
}
