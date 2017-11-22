package pl.bgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.bgs.entity.GameInstance;

public interface GameInstanceRepository extends JpaRepository<GameInstance, Long> {

}
