package br.edu.unifei.ecot13.projeto.futebol;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Partida {
	@Id
	@GeneratedValue
	private int codigo;
	private Calendar data;
	private String resultado;
	@ManyToOne
	private Torneio torneio;
	@OneToOne
	private Clube mandante;
	@OneToOne
	private Clube visitante;
	@ManyToOne
	private Estadio estadio;
}
