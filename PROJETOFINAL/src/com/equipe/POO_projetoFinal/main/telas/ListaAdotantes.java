package com.equipe.POO_projetoFinal.main.telas;

import java.awt.EventQueue;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.equipe.POO_projetoFinal.main.Adotante;

public class ListaAdotantes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaAdotantes frame = new ListaAdotantes();
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
	public ListaAdotantes() {
		setResizable(false);
		setTitle("Adotantes interesados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		//Array com o nome das colunas
		String[] info = {"Nome","Idade","Telefone","E-MAIL","Tipo de moradia",};
		
		DefaultTableModel TabelaDeAdotantes = new DefaultTableModel(info,0);
		
		JTable tabela = new JTable(TabelaDeAdotantes);
		tabela.setEnabled(false);
		
		TabelaDeAdotantes.addRow(new Object[]{"NOME","Idade","TELEFONE", "E-MAIL", "MORADIA",});
		TabelaDeAdotantes.addRow(new Object[]{"Cayque","7000","55-9 2893-2197", "cayqueminecraft@gmail.com","Grande"});
		contentPane.add(tabela);
		
		List<Adotante> listaFiltrada = Adotante.listaAdotantes.stream()
				.collect(Collectors.toList());
		
		for (Adotante a : listaFiltrada) {
			TabelaDeAdotantes.addRow(new Object[] {a.getNome(),a.getIdade(),a.getTelefone(), a.getEmail(), a.getTamanhoDeMoradia()});
		}
	}

}
