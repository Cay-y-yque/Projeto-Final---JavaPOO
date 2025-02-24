package com.equipe.POO_projetoFinal.main;

public abstract class Adotante extends Usuario {
	private String telefone;
	private String email;
	private boolean moradiaAberta;
	private String tamanhoDeMoradia;
	private String[] listaAdotantes;

	// Método construtor
	public Adotante(String nome, int idade, String[] listaAnimais, String telefone, String email, boolean moradiaAberta,
			String tamanhoDeMoradia, String[] listaAdotantes) {
		super(nome, idade, listaAnimais);
		this.telefone = telefone;
		this.email = email;
		this.moradiaAberta = moradiaAberta;
		this.tamanhoDeMoradia = tamanhoDeMoradia;
		this.listaAdotantes = listaAdotantes;
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


	public String[] getListaAdotantes() {
		return listaAdotantes;
	}
	public void setListaAdotantes(String[] listaAdotantes) {
		this.listaAdotantes = listaAdotantes;
	}


	public abstract boolean adotar(int id);
	
	public abstract boolean devolverAnimal(int id);
	
}