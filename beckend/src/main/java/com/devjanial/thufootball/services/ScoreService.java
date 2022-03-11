package com.devjanial.thufootball.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devjanial.thufootball.dto.GameDTO;
import com.devjanial.thufootball.dto.ScoreDTO;
import com.devjanial.thufootball.entities.Game;
import com.devjanial.thufootball.entities.Jogador;
import com.devjanial.thufootball.entities.Score;
import com.devjanial.thufootball.repositories.GameRepository;
import com.devjanial.thufootball.repositories.JogadorRepository;
import com.devjanial.thufootball.repositories.ScoreRepository;

//CAMADA DE SERVIÇO
@Service
public class ScoreService {

	@Autowired
	private GameRepository gameRepository;
	@Autowired
	private JogadorRepository jogadorRepository;
	@Autowired
	private ScoreRepository scoreRepository;
	
	@Transactional
	public GameDTO saveScore(ScoreDTO dto) {
		
		Jogador jogador = jogadorRepository.findByEmail(dto.getEmail());
		if (jogador == null) {
			jogador = new Jogador();
			jogador.setEmail(dto.getEmail());
			jogador.setNome(dto.getNome());
			jogador = jogadorRepository.saveAndFlush(jogador);
			
		}
		
		Game game = gameRepository.findById(dto.getGameId()).get();
		
		Score score = new Score();
		score.setGame(game);
		score.setJogador(jogador);
		score.setValue(dto.getScore());
		
		score = scoreRepository.saveAndFlush(score);
		
		double sum = 0.0;
		for(Score s : game.getScores()) {
			sum = sum + s.getValue();
		}
		double avg = sum / game.getScores().size();//média de notas
		
		game.setCount(game.getScores().size());
		game.setScore(avg);
		
		game = gameRepository.save(game);
		
		return new GameDTO(game);
		
	}

	
}
