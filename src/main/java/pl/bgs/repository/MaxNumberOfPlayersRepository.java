package pl.bgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.bgs.entity.MaxNumberOfPlayers;

public interface MaxNumberOfPlayersRepository extends JpaRepository<MaxNumberOfPlayers, Long> {

}
