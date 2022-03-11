package com.devjanial.thufootball.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjanial.thufootball.entities.Jogador;

//CAMADA DE ACESSO AO BANCO DE DADOS: GET, SETT, PUT, PUSH, ETC...
public interface JogadorRepository extends JpaRepository<Jogador, Long>{

	Jogador findByEmail(String email);
	
}
