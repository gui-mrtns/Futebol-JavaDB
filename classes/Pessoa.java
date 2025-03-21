package br.edu.unifei.ecot13.projeto.futebol;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public abstract class Pessoa {
	private String nome;
	@Id
	@GeneratedValue
	private int registro;
	@Temporal(TemporalType.DATE)
	private Calendar nascimento;
}
