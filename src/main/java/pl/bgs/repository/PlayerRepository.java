package pl.bgs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.bgs.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

//	List<Player> findByFirstName(String firstName);
//	List<Player> findByLastName(String lastName);
//	List<Player> findById(Long Id);
}
