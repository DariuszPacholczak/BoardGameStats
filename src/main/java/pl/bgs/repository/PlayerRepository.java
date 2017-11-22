package pl.bgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.bgs.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
