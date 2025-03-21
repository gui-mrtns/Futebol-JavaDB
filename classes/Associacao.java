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
public class Associacao extends Instituicao {
	private String pais;
	@OneToOne
	private Presidente presidente;
	@ManyToOne
	private Federacao federacao;
	@OneToMany
	private List<Clube> clubes = new ArrayList<Clube>();
}
