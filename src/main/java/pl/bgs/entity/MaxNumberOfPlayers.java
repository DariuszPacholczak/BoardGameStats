package pl.bgs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MaxNumberOfPlayers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	private String maxPlayers;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getMaxPlayers() {
		return maxPlayers;
	}

	public void setMaxPlayers(String maxPlayers) {
		this.maxPlayers = maxPlayers;
	}
}
