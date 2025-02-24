package com.equipe.POO_projetoFinal.main.telas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.equipe.POO_projetoFinal.main.Adotante;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class CadastroAdotante extends JFrame {
	
    private static final long serialVersionUID = 1L;
    public static List<Adotante> listaAdotantes = new ArrayList<>();
    private JPanel contentPane;
    private JTextField txtNome;
    private JTextField txtTelefone;
    private JTextField txtEmail;
    private JSpinner spnIdade;
    private JCheckBox chkMoradiaAberta;
    private JComboBox<String> cmbTamanhoMoradia;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CadastroAdotante frame = new CadastroAdotante();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CadastroAdotante() {
        setTitle("Cadastro de Adotante");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(10, 11, 46, 14);
        contentPane.add(lblNome);
        
        txtNome = new JTextField();
        txtNome.setBounds(66, 8, 150, 20);
        contentPane.add(txtNome);
        txtNome.setColumns(10);
        
        JLabel lblIdade = new JLabel("Idade:");
        lblIdade.setBounds(226, 11, 46, 14);
        contentPane.add(lblIdade);
        
        spnIdade = new JSpinner();
        spnIdade.setModel(new SpinnerNumberModel(18, 0, 120, 1));
        spnIdade.setBounds(282, 8, 50, 20);
        contentPane.add(spnIdade);
        
        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(10, 42, 60, 14);
        contentPane.add(lblTelefone);
        
        txtTelefone = new JTextField();
        txtTelefone.setBounds(66, 39, 150, 20);
        contentPane.add(txtTelefone);
        txtTelefone.setColumns(10);
        
        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(10, 73, 46, 14);
        contentPane.add(lblEmail);
        
        txtEmail = new JTextField();
        txtEmail.setBounds(66, 70, 266, 20);
        contentPane.add(txtEmail);
        txtEmail.setColumns(10);
        
        chkMoradiaAberta = new JCheckBox("Moradia Aberta");
        chkMoradiaAberta.setBounds(10, 104, 150, 23);
        contentPane.add(chkMoradiaAberta);
        
        JLabel lblTamanhoMoradia = new JLabel("Tamanho Moradia:");
        lblTamanhoMoradia.setBounds(160, 108, 120, 14);
        contentPane.add(lblTamanhoMoradia);
        
        cmbTamanhoMoradia = new JComboBox<>();
        cmbTamanhoMoradia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequena", "Média", "Grande" }));
        cmbTamanhoMoradia.setBounds(282, 104, 120, 22);
        contentPane.add(cmbTamanhoMoradia);
        
        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarAdotante();
            }
        });
        btnCadastrar.setBounds(160, 150, 120, 23);
        contentPane.add(btnCadastrar);
    }

    private void cadastrarAdotante() {
        try {
        	String nome = txtNome.getText();
        	int idade = (int) spnIdade.getValue();
        	String telefone = txtTelefone.getText();
        	String email = txtEmail.getText();
        	boolean moradiaAberta = chkMoradiaAberta.isSelected();
        	String tamanhoMoradia = cmbTamanhoMoradia.getSelectedItem().toString();
        	
            Adotante adotante = new Adotante(nome, idade, telefone, email, moradiaAberta, tamanhoMoradia);
            
            listaAdotantes.add(adotante);
            
            JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro no cadastro: " + ex.getMessage(),
                                        "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
