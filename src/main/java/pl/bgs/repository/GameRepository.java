package pl.bgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.bgs.entity.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
