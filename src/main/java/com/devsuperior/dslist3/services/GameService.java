package com.devsuperior.dslist3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist3.dto.GameMinDTO;
import com.devsuperior.dslist3.entitys.Game;
import com.devsuperior.dslist3.repositories.GameRepository;

@Service
public class GameService {
	
    @Autowired
	private GameRepository gameRepository;
		
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
		
	}
	
}
