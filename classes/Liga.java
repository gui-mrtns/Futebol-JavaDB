package br.edu.unifei.ecot13.projeto.futebol;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Liga extends Torneio {
	@OneToMany
	private List<Partida> partidas = new ArrayList<Partida>();
	@OneToOne
	private Clube rebaixado;
	
	@Override
	public void imprimirFormato() {
		System.out.println("Formato Liga: ...");
	}
}
