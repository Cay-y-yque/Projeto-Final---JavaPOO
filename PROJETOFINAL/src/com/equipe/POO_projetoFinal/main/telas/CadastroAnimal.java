package com.equipe.POO_projetoFinal.main.telas;
import com.equipe.POO_projetoFinal.main.Adotante;
import com.equipe.POO_projetoFinal.main.Animal;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.Canvas;
import java.awt.Color;

import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.Button;

public class CadastroAnimal extends JFrame {

	private static final long serialVersionUID = 1L;
	 public static List<Animal> listaAnimais = new ArrayList<>();
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtRaca;
	private JTextField txtPersonalidade;
	private JTextField txtCondicao;
	private JTextField spnAltura;
	private JTextField spnIdade;
	private JTextField spnId;
	private JTextField spnContador;
	private JTextField spnPeso;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAnimal frame = new CadastroAnimal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public CadastroAnimal() {
		  setTitle("Cadastro de Animais");
		JFrame frame = new JFrame();
		setSize(600,600);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<Cadastre um Animal>");
		lblNewLabel.setBounds(166, 11, 101, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(35, 37, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(10, 51, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Idade");
		lblNewLabel_2.setBounds(35, 82, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Raça");
		lblNewLabel_3.setBounds(148, 82, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(35, 107, 30, 20);
		contentPane.add(spinner);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 107, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Peso");
		lblNewLabel_4.setBounds(35, 138, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 157, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("id");
		lblNewLabel_5.setBounds(158, 37, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(119, 51, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(119, 157, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Altura");
		lblNewLabel_6.setBounds(148, 138, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Personalidade");
		lblNewLabel_7.setBounds(20, 188, 74, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 211, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Condições");
		lblNewLabel_8.setBounds(131, 188, 74, 14);
		contentPane.add(lblNewLabel_8);
		
		
		textField_6 = new JTextField();
		textField_6.setBounds(119, 211, 86, 20);
		contentPane.add(textField_6);
		getContentPane().setBackground(new Color(0xFFF8DB));
		textField_6.setColumns(10);
		
		 JButton btnCadastrar = new JButton("CADASTRAR");
	        btnCadastrar.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                cadastrarAnimal();
	            }
	        });
	        btnCadastrar.setBounds(250, 200, 150, 30);
	        contentPane.add(btnCadastrar);
	}
            
	  private void cadastrarAnimal() { 
		  try {
	  
      	String nome = txtNome.getText();
      	String raca = txtRaca.getText();
      	String condicao = txtCondicao.getText();
      	String personalidade = txtPersonalidade.getText();
      
          Animal animal = new Animal(nome, id, raca, personalidade, contador, condicao, peso);
          
          listaAnimais.add(animal);
          
          JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
		
		
		
	
	  }
}

