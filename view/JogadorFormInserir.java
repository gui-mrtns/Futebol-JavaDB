package br.edu.unifei.ecot13.projeto.futebol.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.unifei.ecot13.projeto.futebol.Jogador;
import br.edu.unifei.ecot13.projeto.futebol.DestrezaEnum;
import br.edu.unifei.ecot13.projeto.futebol.PosicaoEnum;

import javax.swing.JSplitPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JButton;

public class JogadorFormInserir extends JFrame {

	private EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("futebolPU");
	private EntityManager em = emf.createEntityManager();
	private Jogador jogador;
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JogadorFormInserir frame = new JogadorFormInserir();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JogadorFormInserir() {
		setTitle("Inserir jogador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNome.setBounds(25, 25, 45, 13);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(90, 22, 175, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblClassificacao = new JLabel("Classificação:");
		lblClassificacao.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblClassificacao.setBounds(25, 60, 67, 13);
		contentPane.add(lblClassificacao);
		
		JSpinner spnClassificacao = new JSpinner();
		spnClassificacao.setBounds(90, 57, 85, 20);
		contentPane.add(spnClassificacao);
		
		JComboBox cmbDestreza = new JComboBox();
		cmbDestreza.setBounds(90, 97, 127, 21);
		cmbDestreza.addItem("");
		cmbDestreza.addItem(DestrezaEnum.CANHOTO);
		cmbDestreza.addItem(DestrezaEnum.DESTRO);
		cmbDestreza.addItem(DestrezaEnum.AMBIDESTRO);
		contentPane.add(cmbDestreza);
		
		JLabel lblDestreza = new JLabel("Destreza:");
		lblDestreza.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDestreza.setBounds(25, 101, 59, 13);
		contentPane.add(lblDestreza);
		
		JLabel lblPosicao = new JLabel("Posição:");
		lblPosicao.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPosicao.setBounds(25, 144, 45, 13);
		contentPane.add(lblPosicao);
		
		JComboBox cmbPosicao = new JComboBox();
		cmbPosicao.setBounds(90, 140, 127, 21);
		cmbPosicao.addItem("");
		cmbPosicao.addItem(PosicaoEnum.GOLEIRO);
		cmbPosicao.addItem(PosicaoEnum.DEFENSOR);
		cmbPosicao.addItem(PosicaoEnum.MEIOCAMPO);
		cmbPosicao.addItem(PosicaoEnum.ATACANTE);
		contentPane.add(cmbPosicao);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador = new Jogador();
				jogador.setNome(txtNome.getText());
				jogador.setClassificacao((int)spnClassificacao.getValue());
				jogador.setDestreza((DestrezaEnum) cmbDestreza.getSelectedItem());
				jogador.setPosicao((PosicaoEnum) cmbPosicao.getSelectedItem());
				em.getTransaction().begin();
				em.persist(jogador);
				em.getTransaction().commit();
			}
		});
		btnInserir.setBounds(90, 205, 85, 21);
		contentPane.add(btnInserir);
	}
}
