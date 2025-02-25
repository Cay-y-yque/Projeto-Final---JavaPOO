package com.equipe.POO_projetoFinal.main.telas;

import com.equipe.POO_projetoFinal.main.Janela;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import com.equipe.POO_projetoFinal.main.Animal;


public class AnimaisDoAbrigo extends JFrame implements Janela{
	private static final long serialVersionUID = 1L;
	private ArrayList<JButton> botoesAnimais = new ArrayList<>();
	
	public AnimaisDoAbrigo() {
		// Setando os atributos do frame
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);;
		this.setSize(740, 800);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setTitle("Lista de Animais");
		// 
		
		//Criando um container para ser o container principal
		JPanel conteudo = new JPanel();
		conteudo.setLayout(null); // Deixando o layout livre para poder colocar os componentes manualmente
		this.setContentPane(conteudo);
		//
		
		//Criando uma área para ser o cabeçalho da tela
		JLabel cabecalho = new JLabel("Animais do Abrigo");
		cabecalho.setBounds(210, 0, 400, 80);
		cabecalho.setFont(new Font(" ", Font.PLAIN, 40));
		conteudo.add(cabecalho);
		//
		
		//Criando um painel que vai representar a área onde os botões de cada animal vão ficar
		JPanel buttonArea = new JPanel();
		buttonArea.setLayout(new FlowLayout(FlowLayout.LEFT, 20 , 10));
		int alturaInterior = (Animal.getListaAnimais().size() * 40 / 3) + 40;
		buttonArea.setPreferredSize(new Dimension(640, alturaInterior));
		//
		
		JButton botao = null;
		//Loop que vai percorrer cada animal da lista e fazer um botão específico para ele.
		for (int i = 1; i <= Animal.getListaAnimais().size(); i++) {

			final Animal animal = Animal.getListaAnimais().get(i-1);
			botao = new JButton("ID: " + animal.getId() + " | " + "Nome: " + animal.getNome());
			botao.setPreferredSize(new Dimension(200, 30));

			botao.addActionListener(e -> criarTelaDoAnimal(animal.getId()));
			
			buttonArea.add(botao);
			botoesAnimais.add(botao);

		}
		//
		
		// Vai criar um painel de scroll que vai mostrar o componente buttonArea.
		JScrollPane scrollParaBotoes = new JScrollPane(buttonArea);
		scrollParaBotoes.setBounds(14, 80, 700, 680);
		scrollParaBotoes.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		conteudo.add(scrollParaBotoes); // adiciona o scroll no painel principal
		//
	
	}
	
	@Override
	public void mostrarJanela(JFrame janela) {
		janela.setVisible(true);
	}
	
	// Função que vai ser chamada quando um botão de um animal for clicado.
	public void criarTelaDoAnimal(int id) {
		mostrarJanela(new TelaDoAnimal(id));
	}
}