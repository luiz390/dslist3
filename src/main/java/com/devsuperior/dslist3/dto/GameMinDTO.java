package com.devsuperior.dslist3.dto;

import com.devsuperior.dslist3.entitys.Game;

public class GameMinDTO {
	
	private Long id;
	private String title;
	private int year;
	private String imgUrl; 
    private String shortDescription;			
	private String longDescription;
	
	public GameMinDTO() {
	}

	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();;
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
		}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}
	
	

}
