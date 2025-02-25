package com.equipe.POO_projetoFinal.main.telas;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.equipe.POO_projetoFinal.main.Janela;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class PatinhasDoInstituto extends JFrame implements Janela{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatinhasDoInstituto frame = new PatinhasDoInstituto();
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
	public PatinhasDoInstituto() {
		setResizable(false);
		setTitle("Patinhas do Instituto");
		setSize(450, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnCadastrarAnimal = new JButton("Cadastrar Animal");
		btnCadastrarAnimal.setBounds(30, 46, 157, 33);
		//TODO: fazer botão abrir nova tela de cadastro para o Animal
		btnCadastrarAnimal.addActionListener(e -> cadastrarAnimal());
		contentPane.setLayout(null);
		contentPane.add(btnCadastrarAnimal);
		
		JButton btnCadastrarAdotante = new JButton("Cadastrar Adotante");
		btnCadastrarAdotante.setBounds(230, 46, 157, 33);
		//cria nova tela de cadastro para o Adotante
		btnCadastrarAdotante.addActionListener(e -> cadastrarAdotante());
		contentPane.add(btnCadastrarAdotante);
		
		JButton btnListarAnimais = new JButton("Listar Animais");
		btnListarAnimais.setBounds(45, 89, 157, 33);
		//lista todos os animais para adoção na tela
		btnListarAnimais.addActionListener(e -> listarAnimaisDoAbrigo());
		
		contentPane.add(btnListarAnimais);
		
		JButton btnListarAdotantes = new JButton("Listar Adotantes");
		btnListarAdotantes.setBounds(212, 89, 157, 33);
		
		//Lista os adotantes interessados/na fila de espera em uma nova tela
		btnListarAdotantes.addActionListener(e -> ListarAdotante());
		contentPane.add(btnListarAdotantes);
		
		JLabel lblNewLabel = new JLabel("BEM-VINDO AO DOMÍNIO DO ABRIGO O QUE GOSTARIA DE FAZER AGORA?");
		
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 416, 34);
		contentPane.add(lblNewLabel);
	}
	
	@Override
	public void mostrarJanela(JFrame janela) {
		janela.setVisible(true);
	}
	
	// Métodos para criar novas telas
	private void ListarAdotante() {
		mostrarJanela(new ListaAdotantes());
	}
	
	private void listarAnimaisDoAbrigo() {
		mostrarJanela(new AnimaisDoAbrigo());
	}
	
	private void cadastrarAdotante() {
		mostrarJanela(new CadastroAdotante());
	}
	
	private void cadastrarAnimal() {
		mostrarJanela(new CadastroAnimal());
	}	
}
