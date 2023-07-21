package com.project.list.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.list.dto.GameDto;
import com.project.list.dto.GameListDto;
import com.project.list.dto.GameMaxDto;
import com.project.list.services.GameListService;
import com.project.list.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDto> findAll(){
		return gameListService.findAll();
	}
	

}
