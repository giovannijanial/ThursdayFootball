package com.devjanial.thufootball.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devjanial.thufootball.dto.GameDTO;
import com.devjanial.thufootball.services.GameService;

//implementa o endpoint(endereço que vc acessa do navegador), responde a pagina de games

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService service;
	
	@GetMapping //para esse metodo responder ao caminho /movies pelo http
	public Page<GameDTO> findAll(Pageable pageable){
		return service.findAll(pageable);
	}
	
	@GetMapping(value ="/{id}")
	public GameDTO findById(@PathVariable Long id ){ //PATH VARIABEL para configurar que o argumento da URL case com a ID
		return service.findById(id);
	}
}
