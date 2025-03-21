package br.edu.unifei.ecot13.projeto.futebol;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Confederacao extends Instituicao {
	private String continente;
	@OneToOne
	private Presidente presidente;
	@ManyToOne
	private Federacao federacao;
}
