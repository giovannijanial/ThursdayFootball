package com.devjanial.thufootball.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devjanial.thufootball.dto.GameDTO;
import com.devjanial.thufootball.entities.Game;
import com.devjanial.thufootball.repositories.GameRepository;

//CAMADA DE SERVIÇO
@Service
public class GameService {

	@Autowired
	private GameRepository repository;
	
	//encontrar todos os filmes dependendo da pagina
	@Transactional(readOnly=true)//melhora eficiencia com o banco de dados
	public Page<GameDTO> findAll(Pageable pageable){
		Page<Game> result = repository.findAll(pageable);
		//convertendo a pagina para a DTO
		//"Função de alta ordem"
		//.map aplica uma função para cada elemento da lista (page)
		Page<GameDTO> page = result.map(x -> new GameDTO(x));
		return page;
	}
	
	//encontrar o game pelo ID
	@Transactional(readOnly=true)
	public GameDTO findById(Long id){
		Game result = repository.findById(id).get(); //para acessar o obj game dentro do optional
		GameDTO dto = new GameDTO(result);
		return dto;
	}
}
