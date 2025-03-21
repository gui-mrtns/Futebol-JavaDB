package br.edu.unifei.ecot13.projeto.futebol;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Jogador extends Pessoa {
	private int classificacao;
	@Enumerated
	private DestrezaEnum destreza;
	@Enumerated
	private PosicaoEnum posicao;
	@ManyToOne
	private Chuteira chuteira;
	@ManyToOne
	private Clube clube;
	
	public void jogar() {
		System.out.println("Jogando...");
	}
}
