package br.edu.unifei.ecot13.projeto.futebol;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public abstract class Instituicao {
	private String nome;
	private String sigla;
	@Id
	@GeneratedValue
	private int registro;
}
