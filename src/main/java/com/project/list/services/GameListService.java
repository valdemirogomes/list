package com.project.list.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.project.list.dto.GameDto;
import com.project.list.dto.GameListDto;
import com.project.list.dto.GameMaxDto;
import com.project.list.entities.Game;
import com.project.list.entities.GameList;
import com.project.list.repositories.GameListRepository;
import com.project.list.repositories.GameRepository;

@Component
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDto> findAll(){
		
		var result = gameListRepository.findAll();
		var dato = result.stream().map(x -> new GameListDto(x)).toList();
		return dato;
	
	} 
	
}
