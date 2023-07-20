package com.project.list.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_elonging")
public class Belonging {
	@EmbeddedId
	private BelongingPK id = new BelongingPK();
	private Integer position;
	
	public Belonging() {
		
	}

	public Belonging(Game game, GameList list, Integer position) {
		this.id.setGame(game);
		this.id.setList(list);
		this.position = position;
	}

	public BelongingPK getId() {
		return id;
	}

	public Integer getPosition() {
		return position;
	}

	public void setId(BelongingPK id) {
		this.id = id;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

}
