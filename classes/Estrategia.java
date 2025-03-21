package br.edu.unifei.ecot13.projeto.futebol;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public abstract class Estrategia {
	@Id
	@GeneratedValue
	private int codigo;
	private String descricao;
	
	public abstract void executar();
}
