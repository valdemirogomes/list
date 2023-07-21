package com.project.list.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.project.list.dto.GameDto;
import com.project.list.dto.GameMaxDto;
import com.project.list.entities.Game;
import com.project.list.projection.GameProjection;
import com.project.list.repositories.GameRepository;

@Component
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameMaxDto findById(Long gameId) {
		
		Game result = gameRepository.findById(gameId).get();
		GameMaxDto dto = new GameMaxDto(result);
		return dto;
		
	}

	
	
	@Transactional(readOnly = true)
	public List<GameDto> findAll(){
		var result = gameRepository.findAll();
		var dato = result.stream().map(x -> new GameDto(x)).toList();
		return dato;
		
	
		
	} 
	@Transactional(readOnly = true)
	public List<GameDto> searchByList(Long listId){
		var result = gameRepository.searchByList(listId);
		var dato = result.stream().map(x -> new GameDto(x)).toList();
		return dato;
		
	
		
	} 
	


}
