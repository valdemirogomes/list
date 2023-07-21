package com.project.list.dto;

import com.project.list.entities.GameList;

public class GameListDto {
	private Long id;
	private String name;
	
	public GameListDto() {
	}

	public GameListDto(GameList entity) {
	this.id = entity.getId();
	this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}

