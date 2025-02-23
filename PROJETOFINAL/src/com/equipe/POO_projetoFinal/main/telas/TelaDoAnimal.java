package com.equipe.POO_projetoFinal.main.telas;

import javax.swing.JPanel;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.equipe.POO_projetoFinal.main.Animal;

public class TelaDoAnimal extends JFrame{
	private static final long serialVersionUID = 1L;
	Animal animalCorrespondente;
	
	public TelaDoAnimal(int id) {
		for (Animal animal : Animal.getListaAnimais()) {
			if (animal.getId() == id) {
				animalCorrespondente = animal;
				break;
			}
		}
		
		super.setSize(600, 600);
		super.setLocationRelativeTo(null);
		super.setTitle(animalCorrespondente.getNome());
		
		JPanel conteudo = new JPanel();
		conteudo.setLayout(null);
		super.setContentPane(conteudo);
		
		int x = 40;
		int y = 300;
		int width = 180;
		int height = 20;
		int fontSize = 15;
		
		JLabel nome = new JLabel("Nome: " + animalCorrespondente.getNome());
		nome.setBounds(x, y, width, height);
		nome.setFont(new Font("", Font.PLAIN, fontSize));
		conteudo.add(nome);
		
		JLabel idade = new JLabel("Idade: " + animalCorrespondente.getIdade());
		idade.setBounds(x+width, y, width, height);
		idade.setFont(new Font("", Font.PLAIN, fontSize));
		conteudo.add(idade);
		
		JLabel raca = new JLabel("Raca: " + animalCorrespondente.getRaca());
		raca.setBounds(x+width*2, y, width, height);
		raca.setFont(new Font("", Font.PLAIN, fontSize));
		conteudo.add(raca);
		
		JLabel personalidade = new JLabel("Personalidade: " + animalCorrespondente.getPersonalidade());
		personalidade.setBounds(x, y+height, width, height);
		personalidade.setFont(new Font("", Font.PLAIN, fontSize));
		conteudo.add(personalidade);
		
		JLabel peso = new JLabel("Peso: " + animalCorrespondente.getPeso());
		peso.setBounds(x+width, y+height, width, height);
		peso.setFont(new Font("", Font.PLAIN, fontSize));
		conteudo.add(peso);
		
		JLabel condicoes = new JLabel("Condições: " + animalCorrespondente.getCondicoes());
		condicoes.setBounds(x+width*2, y+height, width, height);
		condicoes.setFont(new Font("", Font.PLAIN, fontSize));
		conteudo.add(condicoes);
		
		JLabel altura = new JLabel("Altura: " + animalCorrespondente.getAltura());
		altura.setFont(new Font("", Font.PLAIN, fontSize));
		altura.setBounds(x, y+height*2, width, height);
		conteudo.add(altura);
		
	}
	
}
