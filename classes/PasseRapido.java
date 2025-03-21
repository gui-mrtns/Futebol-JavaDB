package br.edu.unifei.ecot13.projeto.futebol;

import javax.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class PasseRapido extends Estrategia {
	private String regiaoFinalizar;
	
	@Override
	public void executar() {
		System.out.println("Executando passe rapido...");
	}
}
