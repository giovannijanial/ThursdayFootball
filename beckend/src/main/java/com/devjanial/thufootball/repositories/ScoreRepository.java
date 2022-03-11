package com.devjanial.thufootball.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjanial.thufootball.entities.Score;
import com.devjanial.thufootball.entities.ScorePK;

//CAMADA DE ACESSO AO BANCO DE DADOS: GET, SETT, PUT, PUSH, ETC...
public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

	
}
