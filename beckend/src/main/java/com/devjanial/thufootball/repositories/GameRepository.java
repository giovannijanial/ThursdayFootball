package com.devjanial.thufootball.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjanial.thufootball.entities.Game;

//CAMADA DE ACESSO AO BANCO DE DADOS: GET, SETT, PUT, PUSH, ETC...
public interface GameRepository extends JpaRepository<Game, Long>{

	
}
