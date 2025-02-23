package com.equipe.POO_projetoFinal.main.telas;

import java.awt.EventQueue;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import com.equipe.POO_projetoFinal.main.Animal;


public class AnimaisDoAbrigo extends JFrame{
	private static final long serialVersionUID = 1L;
	private List<JButton> botoesAnimais = new ArrayList<>();
	
	public AnimaisDoAbrigo() {
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);;
		super.setSize(740, 800);
		super.setLocationRelativeTo(null);
		super.setTitle("Lista de Animais");
		
		JPanel conteudo = new JPanel();
		conteudo.setLayout(null);
		super.setContentPane(conteudo);
		
		JLabel cabecalho = new JLabel("Animais do Abrigo");
		cabecalho.setBounds(210, 0, 400, 80);
		cabecalho.setFont(new Font(" ", Font.PLAIN, 40));
		conteudo.add(cabecalho);
		
		Animal animal1 = new Animal("Pano", 5, "B", "Chato", 85.2, "Saudavel", 33.3);
		Animal animal2 = new Animal("janas", 13, "Ba", "Legal", 85.2, "Saudavel", 33.3);
		Animal animal3 = new Animal("Pacas", 12, "Ban", "Burro", 85.2, "Saudavel", 33.3);
		Animal animal4 = new Animal("Lírio", 1, "Bana", "Inteligente", 85.2, "Saudavel", 33.3);
		Animal animal5 = new Animal("Lóbulo", 50, "Banan", "Sábio", 85.2, "Saudavel", 33.3);
		Animal animal6 = new Animal("Rinoceronte", 4, "Banana", "Emocionado", 85.2, "Saudavel", 33.3);
		
		Animal.getListaAnimais().add(animal1); Animal.getListaAnimais().add(animal2); Animal.getListaAnimais().add(animal3);
		Animal.getListaAnimais().add(animal4); Animal.getListaAnimais().add(animal5); Animal.getListaAnimais().add(animal6);
		
		JButton botao = null;
		int x = 30;
		int y = 80;

		for (int i = 1; i <= Animal.getListaAnimais().size(); i++) {
			if (y >= 800) {
				break;
			}

			final Animal animal = Animal.getListaAnimais().get(i-1);
			botao = new JButton("Nome: " + animal.getNome() + " | " + "ID: " + animal.getId());
			botao.addActionListener(e -> criarTelaDoAnimal(animal.getId()));
			botao.setBounds(x, y, 200, 20);
			
			conteudo.add(botao);
			botoesAnimais.add(botao);
			
			x+= 230;
			if (i % 3 == 0) {
				x = 30;
				y += 30;
			}
			
		}
		
		
		
	
	}
	
	public void criarTelaDoAnimal(int id) {
		TelaDoAnimal telaA = new TelaDoAnimal(id);
		telaA.setVisible(true);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimaisDoAbrigo frame = new AnimaisDoAbrigo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
