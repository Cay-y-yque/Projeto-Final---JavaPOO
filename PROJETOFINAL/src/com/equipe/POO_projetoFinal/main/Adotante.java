package com.equipe.POO_projetoFinal.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Adotante extends Usuario {
	private String telefone;
	private String email;
	private boolean moradiaAberta;
	private String tamanhoDeMoradia;
	public static List<Adotante> listaAdotantes = new ArrayList<>();
	private List<Animal> animaisAdotados = new ArrayList<>();

	// Método construtor
	public Adotante(String nome, int idade, String telefone, String email, boolean moradiaAberta,
			String tamanhoDeMoradia) {
		super(nome, idade);
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
		Adotante.listaAdotantes.add(this);
	}
	@Override
	public void remover() {
		Adotante.listaAdotantes.remove(this);
	}

	public boolean adotar(int id) {
		Iterator<Animal> iterator = Animal.getListaAnimais().iterator();
                while(iterator.hasNext()) {
                    Animal animal = iterator.next();
                    if(animal.getId() == id) {
                        animaisAdotados.add(animal);
                        iterator.remove();
                        return true;
                    }
                }
	return false;
	}

	public boolean devolverAnimal(int id) {
		return false;
	}
}