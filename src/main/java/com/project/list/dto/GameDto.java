package com.project.list.dto;

import com.project.list.entities.Game;

public class GameDto {
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameDto() {
		
	}

	public GameDto(Game entity) {
		super();
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	

}
