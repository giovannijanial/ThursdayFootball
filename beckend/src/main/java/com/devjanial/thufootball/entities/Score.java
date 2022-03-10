package com.devjanial.thufootball.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_score")
public class Score {
	
	@EmbeddedId
	private ScorePK id = new ScorePK();
	private Double value;
	
	public Score() {
		
	}
	
	//Informar um game e associar ao score
	public void setGame(Game game ) {
		id.setGame(game);
	}
	
	//Associar o jogador ao score
	public void setJogador(Jogador jogador) {
		id.setJogador(jogador);
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	
}
