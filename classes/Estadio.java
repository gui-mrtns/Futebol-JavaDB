package br.edu.unifei.ecot13.projeto.futebol;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Estadio {
	private String nome;
	@Id
	private String endereco;
	private int capacidade;
}
