package com.equipe.POO_projetoFinal.main.telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JInternalFrame;

public class AbrigoPorteLivre extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbrigoPorteLivre frame = new AbrigoPorteLivre();
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
	public AbrigoPorteLivre() {
		setResizable(false);
		setTitle("ABRIGO PORTE LIVRE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnCadastrarAnimal = new JButton("Cadastrar Animal");
		btnCadastrarAnimal.setBounds(30, 46, 157, 33);
		//TODO: fazer botão abrir nova tela de cadastro para o Animal
		btnCadastrarAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Passando para tela de cadastro de animais...");
				
			}
		});
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
	// Método para criar nova tela
	private void ListarAdotante() {
		ListaAdotantes listaDeAdotante = new ListaAdotantes();
		listaDeAdotante.setVisible(true);
	}
	
	private void listarAnimaisDoAbrigo() {
		AnimaisDoAbrigo animalDoAbrigo = new AnimaisDoAbrigo();
		animalDoAbrigo.setVisible(true);
	}
	
	private void cadastrarAdotante() {
		// Colocar nome da classe da tela de cadastro
		CadastroAdotante cadastroAdotante = new CadastroAdotante();
		cadastroAdotante.setVisible(true);
	}
	
	// QUANDO HOUVER UMA CLASSE CHAMADA CadastroAnimal -> RETIRE O COMENTARIO!!
	
	//private void cadastrarAnimal() {
		//CadastroAnimal cadastroAnimal = new CadastroAnimal();
		//cadastroAnimal.setVisible();
	//}
	
