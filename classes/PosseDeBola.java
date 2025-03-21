package br.edu.unifei.ecot13.projeto.futebol;

import javax.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class PosseDeBola extends Estrategia {
	private String regiaoPosse;
	
	@Override
	public void executar() {
		System.out.println("Executando posse de bola...");
	}
}
