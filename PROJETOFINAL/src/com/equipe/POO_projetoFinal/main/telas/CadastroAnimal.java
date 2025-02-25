package com.equipe.POO_projetoFinal.main.telas;

import com.equipe.POO_projetoFinal.main.Animal;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSpinner;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CadastroAnimal extends JFrame {

	private static final long serialVersionUID = 1L;
	 public static List<Animal> listaAnimais = new ArrayList<>();
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtRaca;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtPersonalidade;
	private JTextField txtCondicao;
	private JSpinner spnIdade;

	
	public CadastroAnimal() {
		setTitle("Cadastro de Animais");
		setSize(450, 300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCabecalho = new JLabel("<Cadastre um Animal>");
		lblCabecalho.setBounds(166, 11, 130, 15);
		contentPane.add(lblCabecalho);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(35, 37, 46, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 51, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(35, 82, 46, 14);
		contentPane.add(lblIdade);
		
		JLabel lblRaca = new JLabel("Raça");
		lblRaca.setBounds(148, 82, 46, 14);
		contentPane.add(lblRaca);
		
		spnIdade = new JSpinner();
		spnIdade.setBounds(35, 107, 30, 20);
		spnIdade.setModel(new SpinnerNumberModel(18, 0, 120, 1));
		contentPane.add(spnIdade);
		
		txtRaca = new JTextField();
		txtRaca.setBounds(119, 107, 86, 20);
		contentPane.add(txtRaca);
		txtRaca.setColumns(10);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(35, 138, 46, 14);
		contentPane.add(lblPeso);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(10, 157, 86, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(119, 157, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(148, 138, 46, 14);
		contentPane.add(lblAltura);
		
		JLabel lblPersonalidade = new JLabel("Personalidade");
		lblPersonalidade.setBounds(20, 188, 74, 14);
		contentPane.add(lblPersonalidade);
		
		txtPersonalidade = new JTextField();
		txtPersonalidade.setBounds(10, 211, 86, 20);
		contentPane.add(txtPersonalidade);
		txtPersonalidade.setColumns(10);
		
		JLabel lblCondicao = new JLabel("Condicao");
		lblCondicao.setBounds(131, 188, 74, 14);
		contentPane.add(lblCondicao);
		
		
		txtCondicao = new JTextField();
		txtCondicao.setBounds(119, 211, 86, 20);
		contentPane.add(txtCondicao);
		getContentPane().setBackground(new Color(0xFFF8DB));
		txtCondicao.setColumns(10);
		
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
	      	int idade = (int) spnIdade.getValue();
	      	String raca = txtRaca.getText();
	      	String condicao = txtCondicao.getText();
	      	String personalidade = txtPersonalidade.getText();
	      	double peso = Double.parseDouble(txtPeso.getText());
	      	double altura = Double.parseDouble(txtAltura.getText());
	      
			Animal animal = new Animal(nome, idade, raca, personalidade, peso, condicao, altura);
	          
	        animal.registrar();
	         
	          JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
		 }
		 catch(Exception e) {
			  JOptionPane.showMessageDialog(this, "Houve um erro no cadastro: " + e.getMessage());
		 }
		 finally {
			 txtNome.setText("");
			 spnIdade.setValue(18);
			 txtRaca.setText("");
			 txtCondicao.setText("");
			 txtPersonalidade.setText("");
			 txtPeso.setText("");
			 txtAltura.setText("");
			  
		 }
		
		
	
	  }
}
