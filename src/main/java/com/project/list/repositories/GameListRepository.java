package com.project.list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.project.list.entities.GameList;

@Component
public interface GameListRepository extends JpaRepository<GameList, Long> {

}
