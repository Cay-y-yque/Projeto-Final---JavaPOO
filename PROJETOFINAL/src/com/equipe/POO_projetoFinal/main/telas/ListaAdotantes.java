package com.equipe.POO_projetoFinal.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

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
		setTitle("Adotantes interesados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		//Array com o nome das colunas
		String[] info = {"Telefone","E-MAIL","Tipo de moradia",};
		
		DefaultTableModel TabelaDeAdotantes = new DefaultTableModel(info,0);
		
		JTable tabela = new JTable(TabelaDeAdotantes);
		tabela.setEnabled(false);
		
		TabelaDeAdotantes.addRow(new Object[]{"55-9 8127-4873", "simpaeio@gmail.com", "Grande",});
		
		contentPane.add(tabela);
	}

}
