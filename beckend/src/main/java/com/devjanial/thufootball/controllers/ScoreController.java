package com.devjanial.thufootball.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devjanial.thufootball.dto.GameDTO;
import com.devjanial.thufootball.dto.ScoreDTO;
import com.devjanial.thufootball.services.ScoreService;

//implementa o endpoint(endereço que vc acessa do navegador), responde a pagina de games

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService service;
	
	@PutMapping
	public GameDTO saveScore(@RequestBody ScoreDTO dto){
		
		GameDTO gameDTO = service.saveScore(dto);
		
		return gameDTO;
	}
}
