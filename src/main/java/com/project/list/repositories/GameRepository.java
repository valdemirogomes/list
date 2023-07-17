package com.project.list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.list.entities.Game;


public interface GameRepository extends JpaRepository<Game, Long>{
	

}
