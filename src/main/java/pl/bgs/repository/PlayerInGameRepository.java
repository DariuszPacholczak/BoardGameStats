package pl.bgs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.bgs.entity.PlayerInGame;

public interface PlayerInGameRepository extends JpaRepository<PlayerInGame, Long> {

	List<PlayerInGame> findByGameInstanceId(Long gameInstanceId);
}
