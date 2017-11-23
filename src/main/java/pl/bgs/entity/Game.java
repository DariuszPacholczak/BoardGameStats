package pl.bgs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	private String title;
	
	@ManyToOne
	private MaxNumberOfPlayers maxNumberOfPlayers;
	
	@ManyToOne
	private MaxPlayTime maxPlayTime;
	
	@ManyToOne
	private GameCategory gameCategory;
	
	@Min(value = 1)
	@Max(value = 5)
	private double complexityRating;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public MaxNumberOfPlayers getMaxNumberOfPlayers() {
		return maxNumberOfPlayers;
	}

	public void setMaxNumberOfPlayers(MaxNumberOfPlayers maxNumberOfPlayers) {
		this.maxNumberOfPlayers = maxNumberOfPlayers;
	}

	public MaxPlayTime getMaxPlayTime() {
		return maxPlayTime;
	}

	public void setMaxPlayTime(MaxPlayTime maxPlayTime) {
		this.maxPlayTime = maxPlayTime;
	}

	public GameCategory getGameCategory() {
		return gameCategory;
	}

	public void setGameCategory(GameCategory gameCategory) {
		this.gameCategory = gameCategory;
	}

	public double getComplexityRating() {
		return complexityRating;
	}

	public void setComplexityRating(double complexityRating) {
		this.complexityRating = complexityRating;
	}
}
