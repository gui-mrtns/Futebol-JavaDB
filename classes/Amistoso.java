package br.edu.unifei.ecot13.projeto.futebol;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Amistoso extends Torneio {
	@OneToOne
	private Partida partida;
	@OneToOne
	private Clube vencedor;

	@Override
	public void imprimirFormato() {
		System.out.println("Formato Amistoso: ...");
	}
}
