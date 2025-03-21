package br.edu.unifei.ecot13.projeto.futebol;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Treinador extends Pessoa {
	private int lideranca;
	@ManyToOne
	private Estrategia estrategia;
	@OneToOne
	private Clube clube;

	public void comandar() {
		System.out.println("Comandando...");
	}
}
