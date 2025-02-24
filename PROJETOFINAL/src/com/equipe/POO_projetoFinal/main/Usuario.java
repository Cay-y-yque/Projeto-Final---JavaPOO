package com.equipe.POO_projetoFinal.main;

public abstract class Usuario {
    private String nome;
    private int idade;
    private String[] listaAnimais;
    
    public Usuario(String nome, int idade, String[] listaAnimais){
    	this.idade = idade;
    	this.nome = nome;
    }
	
    public Usuario() {}
	
    public abstract void registrar();
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String[] getListaAnimais() {
		return listaAnimais;
	}
	public void setListaAnimais(String[] listaAnimais) {
		this.listaAnimais = listaAnimais;
	}
}
