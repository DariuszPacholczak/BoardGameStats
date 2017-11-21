package pl.bgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.bgs.entity.GameCategory;

public interface GameCategoryRepository extends JpaRepository<GameCategory, Long> {

}
