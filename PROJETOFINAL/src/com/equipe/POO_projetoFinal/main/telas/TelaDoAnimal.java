package com.equipe.POO_projetoFinal.main.telas;

import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import com.equipe.POO_projetoFinal.main.Animal;

public class TelaDoAnimal extends JFrame{
	private static final long serialVersionUID = 1L;
	Animal animalCorrespondente;
	
	public TelaDoAnimal(int id) {
		// Através do ID, pega o animal correspondente ao botão clicado.
		for (Animal animal : Animal.getListaAnimais()) {
			if (animal.getId() == id) {
				animalCorrespondente = animal;
				break;
			}
		}
		//
		
		// define os atributos da tela
		this.setSize(600, 600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setTitle(animalCorrespondente.getNome());
		//
		
		// cria o painel principal
		JPanel conteudo = new JPanel();
		conteudo.setLayout(null);
		this.setContentPane(conteudo);
		//
		
		//padronizar o tamanho/altura, tamanho da fonte da label
		int width = 560;
		int height = 20;
		int fontSize = 15;
		//
		
		//criando as labels para cada atributo que é necessário mostrar
		JLabel nome = new JLabel("Nome: " + animalCorrespondente.getNome());
		nome.setBounds(10, 290, width, height);
		nome.setFont(new Font("", Font.PLAIN, fontSize));
		conteudo.add(nome);
		
		JLabel idade = new JLabel("Idade: " + animalCorrespondente.getIdade());
		idade.setBounds(10, 321, width, height);
		idade.setFont(new Font("", Font.PLAIN, fontSize));
		conteudo.add(idade);
		
		JLabel raca = new JLabel("Raca: " + animalCorrespondente.getRaca());
		raca.setBounds(10, 352, width, height);
		raca.setFont(new Font("", Font.PLAIN, fontSize));
		conteudo.add(raca);
		
		JLabel personalidade = new JLabel("Personalidade: " + animalCorrespondente.getPersonalidade());
		personalidade.setBounds(10, 476, width, height);
		personalidade.setFont(new Font("", Font.PLAIN, fontSize));
		conteudo.add(personalidade);
		
		JLabel peso = new JLabel("Peso: " + animalCorrespondente.getPeso());
		peso.setBounds(10, 445, width, height);
		peso.setFont(new Font("", Font.PLAIN, fontSize));
		conteudo.add(peso);
		
		JLabel condicoes = new JLabel("Condições: " + animalCorrespondente.getCondicoes());
		condicoes.setBounds(10, 383, width, height);
		condicoes.setFont(new Font("", Font.PLAIN, fontSize));
		conteudo.add(condicoes);
		
		JLabel altura = new JLabel("Altura: " + animalCorrespondente.getAltura());
		altura.setFont(new Font("", Font.PLAIN, fontSize));
		altura.setBounds(10, 414, width, height);
		conteudo.add(altura);
		
		JLabel textId = new JLabel("ID: " + id);
		textId.setFont(new Font("", Font.PLAIN, fontSize));
		textId.setBounds(0, 0, 120, 20);
		conteudo.add(textId);
		//
		
		// definindo a imagem da logo do abrigo
		ImageIcon imageAbrigo = new ImageIcon("logo.jpg");
		
		JLabel lblLogo = new JLabel();
		lblLogo.setIcon(imageAbrigo);
		lblLogo.setHorizontalAlignment(JLabel.CENTER);
		//
		
		// colocando a logo na tela
		lblLogo.setBounds(0, 0, 584, 260);
		conteudo.add(lblLogo);
		//
	}
}
