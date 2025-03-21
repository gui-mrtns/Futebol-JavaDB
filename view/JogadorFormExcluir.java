package br.edu.unifei.ecot13.projeto.futebol.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.unifei.ecot13.projeto.futebol.Jogador;
import br.edu.unifei.ecot13.projeto.futebol.DestrezaEnum;
import br.edu.unifei.ecot13.projeto.futebol.PosicaoEnum;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTextField;

public class JogadorFormExcluir extends JFrame {

	private EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("futebolPU");
	private EntityManager em = emf.createEntityManager();
	private Jogador jogador;
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtPosicao;
	private JTextField txtDestreza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JogadorFormExcluir frame = new JogadorFormExcluir();
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
	public JogadorFormExcluir() {
		setTitle("Excluir jogador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistro = new JLabel("Registro:");
		lblRegistro.setBounds(10, 10, 78, 13);
		contentPane.add(lblRegistro);
		
		JSpinner spnRegistro = new JSpinner();
		spnRegistro.setBounds(91, 7, 90, 20);
		contentPane.add(spnRegistro);

		JSpinner spnClassificacao = new JSpinner();
		spnClassificacao.setBounds(117, 77, 105, 20);
		contentPane.add(spnClassificacao);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spnRegistro.setValue(0);
				txtNome.setText("");
				spnClassificacao.setValue(0);
				txtDestreza.setText("");
				txtPosicao.setText("");
				em.getTransaction().begin();
				em.remove(jogador);
				em.getTransaction().commit();
			}
		});
		btnExcluir.setBounds(96, 195, 85, 21);
		contentPane.add(btnExcluir);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador=em.find(Jogador.class, (int) spnRegistro.getValue());
				if(jogador!=null) {
					spnRegistro.setEnabled(false);
					txtNome.setText(jogador.getNome());
					spnClassificacao.setValue(jogador.getClassificacao());
					txtDestreza.setText(jogador.getDestreza().name());
					txtPosicao.setText(jogador.getPosicao().name());
					btnExcluir.setEnabled(true);
				} else {
					JOptionPane.showMessageDialog(null, "Jogador não existe!");
				}
			}
		});
		btnBuscar.setBounds(191, 10, 85, 21);
		contentPane.add(btnBuscar);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 51, 56, 13);
		contentPane.add(lblNome);
		
		JLabel lblClassificacao = new JLabel("Classificacao:");
		lblClassificacao.setBounds(10, 80, 105, 13);
		contentPane.add(lblClassificacao);
		
		txtNome = new JTextField();
		txtNome.setBounds(65, 48, 157, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblPosicao = new JLabel("Posição:");
		lblPosicao.setBounds(10, 137, 90, 13);
		contentPane.add(lblPosicao);
		
		txtPosicao = new JTextField();
		txtPosicao.setBounds(100, 134, 122, 19);
		contentPane.add(txtPosicao);
		txtPosicao.setColumns(10);
		
		JLabel lblDestreza = new JLabel("Destreza:");
		lblDestreza.setBounds(10, 111, 90, 13);
		contentPane.add(lblDestreza);
		
		txtDestreza = new JTextField();
		txtDestreza.setColumns(10);
		txtDestreza.setBounds(100, 108, 122, 19);
		contentPane.add(txtDestreza);
	}

}
