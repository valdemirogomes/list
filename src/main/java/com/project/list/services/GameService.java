package com.project.list.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.project.list.dto.GameDto;
import com.project.list.dto.GameMaxDto;
import com.project.list.entities.Game;
import com.project.list.repositories.GameRepository;

@Component
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public GameMaxDto findById(Long gameId) {
		Game result = repository.findById(gameId).get();
		GameMaxDto dto = new GameMaxDto(result);
		return dto;
		
	}
	
	@Transactional(readOnly = true)
	public List<GameDto> findAll(){
		
		var result = repository.findAll();
		
		var dato = result.stream().map(x -> new GameDto(x)).toList();
		
		return dato;
		
	
		
	} 
	


}
