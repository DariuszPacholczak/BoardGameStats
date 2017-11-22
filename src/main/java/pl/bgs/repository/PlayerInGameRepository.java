package pl.bgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.bgs.entity.PlayerInGame;

public interface PlayerInGameRepository extends JpaRepository<PlayerInGame, Long> {

}
