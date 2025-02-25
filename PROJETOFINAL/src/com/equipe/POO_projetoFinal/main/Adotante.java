package com.equipe.POO_projetoFinal.main;

import java.util.ArrayList;
import java.util.List;

public class Adotante extends Usuario {
	private String telefone;
	private String email;
	private boolean moradiaAberta;
	private String tamanhoDeMoradia;
	public static List<Adotante> listaAdotantes = new ArrayList<>();

	// Método construtor
	public Adotante(String nome, int idade, String telefone, String email, boolean moradiaAberta,
			String tamanhoDeMoradia) {
		super(nome, idade, listaAnimais);
		this.telefone = telefone;
		this.email = email;
		this.moradiaAberta = moradiaAberta;
		this.tamanhoDeMoradia = tamanhoDeMoradia;
	}
	
	public Adotante() {
		super();
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isMoradiaAberta() {
		return moradiaAberta;
	}
	public void setMoradiaAberta(boolean moradiaAberta) {
		this.moradiaAberta = moradiaAberta;
	}

	public String getTamanhoDeMoradia() {
		return tamanhoDeMoradia;
	}
	public void setTamanhoDeMoradia(String tamanhoDeMoradia) {
		this.tamanhoDeMoradia = tamanhoDeMoradia;
	}

	@Override
	public void registrar() {
	}

	public boolean adotar(int id) {
		return false;
	}

	public boolean devolverAnimal(int id) {
		return false;
	}
}
