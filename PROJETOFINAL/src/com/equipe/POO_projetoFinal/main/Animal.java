package com.equipe.POO_projetoFinal.main;
import java.util.ArrayList;
import java.util.List;

public class Animal extends Usuario{
	//Definindo os atributos
	private String tipoDoAnimal;
	private String personalidade;
	private double peso;
	private String condicao;
	private double altura;
	private final int id;
	private static int contador;
	private static List<Animal> listaAnimais = new ArrayList<>();
	//
	
	//primeiro construtor
	public Animal(){
		super();
		
		contador++;
		id = contador; //dá o id com base na numeração de sua criação.
	}
	//
	
	//segundo construtor
	public Animal(String nome, int idade, String tipoDoAnimal, String personalidade, double peso, String condicao, double altura){
		super(nome, idade);
		this.tipoDoAnimal = tipoDoAnimal;
		this.personalidade = personalidade;
		this.peso = peso;
		this.condicao = condicao;
		this.altura = altura;
		
		contador++;
		id = contador;
	}
	//
	
	//Métodos da classe
	
	//Sobrescrita dos métodos abstratos
	@Override
	public void registrar() {
		Animal.getListaAnimais().add(this);
	}
	@Override
	public void remover() {
		Animal.getListaAnimais().remove(this);
	}
	//

	public String getTipoDoAnimal() {
		return tipoDoAnimal;
	}

	public void setTipoDoAnimal(String tipoDoAnimal) {
		this.tipoDoAnimal = tipoDoAnimal;
	}

	public String getPersonalidade() {
		return personalidade;
	}

	public void setPersonalidade(String personalidade) {
		this.personalidade = personalidade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCondicao() {
		return condicao;
	}

	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public static List<Animal> getListaAnimais() {
		return listaAnimais;
	}

	public static void setListaAnimais(List<Animal> listaAnimais) {
		Animal.listaAnimais = listaAnimais;
	}
	
	public int getId() {
		return id;
	}
	//
	
}
