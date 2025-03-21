package br.edu.unifei.ecot13.projeto.futebol;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Presidente extends Pessoa {
	private String especializacao;
	@OneToOne
	private Instituicao instituicao;

	public void organizar() {
		System.out.println("Organizando...");
	}
}
