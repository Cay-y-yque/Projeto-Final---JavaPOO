package com.equipe.POO_projetoFinal.main;

public abstract class Usuario {
    private String nome;
    private int idade;
    
    public Usuario(String nome, int idade){
    	this.idade = idade;
    	this.nome = nome;
    }
	
    public Usuario() {}
    
    public abstract void registrar();
    public abstract void remover();
	
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

}
