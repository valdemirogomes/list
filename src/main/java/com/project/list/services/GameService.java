package com.project.list.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.project.list.dto.GameDto;
import com.project.list.repositories.GameRepository;

@Component
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	public List<GameDto> findAll(){
		
		var result = repository.findAll();
		
		var dato = result.stream().map(x -> new GameDto(x)).toList();
		
		return dato;
		
	
		
	}

}
