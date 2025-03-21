package br.edu.unifei.ecot13.projeto.futebol;

import java.awt.Color;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("futebolPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Federacao fifa = new Federacao();
		fifa.setNome("Fédération Internationale de Football Association");
		fifa.setSigla("FIFA");
		fifa.setRegras("Se divertir!");
		em.persist(fifa);
		
		Confederacao conmebol = new Confederacao();
		conmebol.setNome("Confederación Sudamericana de Fútbol");
		conmebol.setSigla("CONMEBOL");
		conmebol.setContinente("América do Sul");
		em.persist(conmebol);

		Associacao cbf = new Associacao();
		cbf.setNome("Confederação Brasileira de Futebol");
		cbf.setSigla("CBF");
		cbf.setPais("Brasil");
		em.persist(cbf);
		
		Clube flamengo = new Clube();
		flamengo.setNome("Clube de Regatas do Flamengo");
		flamengo.setSigla("CRF");
		flamengo.setTorcida(45000);
		em.persist(flamengo);
		
		Estadio maracana = new Estadio();
		maracana.setNome("Estádio Jornalista Mário Filho");
		maracana.setEndereco("Avenida Presidente Castelo Branco, Rio de Janeiro (RJ), Brasil.");
		maracana.setCapacidade(78000);
		em.persist(maracana);
		
		Presidente landim = new Presidente();
		landim.setNome("Luiz Rodolfo Landim Machado");
		landim.setEspecializacao("Engenheiro");
		em.persist(landim);
		
		Treinador tite = new Treinador();
		tite.setNome("Adenor Leonardo Bachi");
		tite.setLideranca(90);
		em.persist(tite);
		
		PosseDeBola posse = new PosseDeBola();
		posse.setDescricao("Manter posse de bola!");
		posse.setRegiaoPosse("Intermediária adversária");		
		em.persist(posse);
		
		Jogador arrascaeta = new Jogador();
		arrascaeta.setNome("Giorgian Daniel De Arrascaeta Benedetti");
		arrascaeta.setClassificacao(85);
		arrascaeta.setDestreza(DestrezaEnum.CANHOTO);
		arrascaeta.setPosicao(PosicaoEnum.MEIOCAMPO);
		em.persist(arrascaeta);
		
		Chuteira classica = new Chuteira();
		classica.setModelo("Clássica");
		classica.setTamanho(42);
		classica.setCor(new Color(0, 0, 0));
		em.persist(classica);
		
		Amistoso amistoso = new Amistoso();
		amistoso.setNome("Amistoso");
		amistoso.setTemporada(2023);
		em.persist(amistoso);
		
		Partida partida = new Partida();
		partida.setResultado("3x0");
		em.persist(partida);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
