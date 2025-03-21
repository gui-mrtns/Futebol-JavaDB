package br.edu.unifei.ecot13.projeto.futebol;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public abstract class Torneio {
	@Id
	@GeneratedValue
	private int codigo;
	private String nome;
	private int temporada;
	@ManyToOne
	private Instituicao instituicao;
	
	public abstract void imprimirFormato();
}
