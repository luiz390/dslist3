package com.devsuperior.dslist3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist3.dto.GameMinDTO;
import com.devsuperior.dslist3.services.GameService;

@RestController
@RequestMapping(value = "/game")
public class GameController {
	
	@Autowired
	private GameService gameService;

	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
		
	}
	
	
	
	
	
	
}
