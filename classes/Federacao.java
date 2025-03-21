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
public class Federacao extends Instituicao {
	private String regras;
	@OneToOne
	private Presidente presidente;
	@OneToMany
	private List<Confederacao> confederacoes = new ArrayList<Confederacao>();
	@OneToMany
	private List<Associacao> associacoes = new ArrayList<Associacao>();
}
