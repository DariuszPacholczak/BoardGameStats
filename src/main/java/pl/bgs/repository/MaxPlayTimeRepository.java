package pl.bgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.bgs.entity.MaxPlayTime;

public interface MaxPlayTimeRepository extends JpaRepository<MaxPlayTime, Long> {

}
