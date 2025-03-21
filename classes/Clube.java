package br.edu.unifei.ecot13.projeto.futebol;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Clube extends Instituicao {
	private int torcida;
	@OneToOne
	private Presidente presidente;
	@OneToOne
	private Treinador treinador;
	@OneToMany
	private List<Jogador> jogadores = new ArrayList<Jogador>();
	@ManyToOne
	private Associacao associacao;
}
