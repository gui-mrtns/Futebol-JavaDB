package br.edu.unifei.ecot13.projeto.futebol;

import java.awt.Color;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Chuteira {
	@Id
	private String modelo;
	private int tamanho;
	private Color cor;
}
