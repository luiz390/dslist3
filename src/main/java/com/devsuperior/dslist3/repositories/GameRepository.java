package com.devsuperior.dslist3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist3.entitys.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
