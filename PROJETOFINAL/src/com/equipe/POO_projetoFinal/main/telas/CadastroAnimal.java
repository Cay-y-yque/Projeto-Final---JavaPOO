package com.equipe.POO_projetoFinal.main.telas;

import com.equipe.POO_projetoFinal.main.Cadastro;
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
import javax.swing.SwingConstants;

public class CadastroAnimal extends JFrame implements Cadastro{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTipoDoAnimal;
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
		lblCabecalho.setHorizontalAlignment(SwingConstants.CENTER);
		lblCabecalho.setBounds(152, 11, 130, 15);
		contentPane.add(lblCabecalho);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(118, 37, 86, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(118, 52, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdade.setBounds(198, 182, 40, 14);
		contentPane.add(lblIdade);
		
		JLabel lblTipoDoAnimal = new JLabel("Tipo Do Animal");
		lblTipoDoAnimal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoDoAnimal.setBounds(227, 37, 86, 14);
		contentPane.add(lblTipoDoAnimal);
		
		spnIdade = new JSpinner();
		spnIdade.setBounds(198, 197, 40, 20);
		spnIdade.setModel(new SpinnerNumberModel(1, 0, 120, 1));
		contentPane.add(spnIdade);
		
		txtTipoDoAnimal = new JTextField();
		txtTipoDoAnimal.setBounds(227, 52, 86, 20);
		contentPane.add(txtTipoDoAnimal);
		txtTipoDoAnimal.setColumns(10);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeso.setBounds(118, 83, 86, 14);
		contentPane.add(lblPeso);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(118, 99, 86, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(227, 99, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltura.setBounds(227, 83, 86, 14);
		contentPane.add(lblAltura);
		
		JLabel lblPersonalidade = new JLabel("Personalidade");
		lblPersonalidade.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonalidade.setBounds(118, 130, 86, 20);
		contentPane.add(lblPersonalidade);
		
		txtPersonalidade = new JTextField();
		txtPersonalidade.setBounds(118, 151, 86, 20);
		contentPane.add(txtPersonalidade);
		txtPersonalidade.setColumns(10);
		
		JLabel lblCondicao = new JLabel("Condicao");
		lblCondicao.setHorizontalAlignment(SwingConstants.CENTER);
		lblCondicao.setBounds(227, 133, 86, 14);
		contentPane.add(lblCondicao);
		
		
		txtCondicao = new JTextField();
		txtCondicao.setBounds(227, 151, 86, 20);
		contentPane.add(txtCondicao);
		getContentPane().setBackground(new Color(0xFFF8DB));
		txtCondicao.setColumns(10);
		
		 JButton btnCadastrar = new JButton("CADASTRAR");
	        btnCadastrar.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                cadastrar();
	            }
	        });
	        btnCadastrar.setBounds(274, 220, 150, 30);
	        contentPane.add(btnCadastrar);
	}
      
      @Override
	  public void cadastrar() { 
		try {
	  
	      	String nome = txtNome.getText();
	      	int idade = (int) spnIdade.getValue();
	      	String tipoDoAnimal = txtTipoDoAnimal.getText();
	      	String condicao = txtCondicao.getText();
	      	String personalidade = txtPersonalidade.getText();
	      	double peso = Double.parseDouble(txtPeso.getText());
	      	double altura = Double.parseDouble(txtAltura.getText());
	      
			Animal animal = new Animal(nome, idade, tipoDoAnimal, personalidade, peso, condicao, altura);
	          
	        animal.registrar();
	         
	          JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
		 }
		 catch(Exception e) {
			  JOptionPane.showMessageDialog(this, "Houve um erro no cadastro: " + e.getMessage());
		 }
		 finally {
			 txtNome.setText("");
			 spnIdade.setValue(1);
			 txtTipoDoAnimal.setText("");
			 txtCondicao.setText("");
			 txtPersonalidade.setText("");
			 txtPeso.setText("");
			 txtAltura.setText("");
			  
		 }
		
		
	
	  }
}
