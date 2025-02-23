package com.equipe.POO_projetoFinal.main;
import java.util.ArrayList;
import java.util.List;

public class Animal extends Usuario{
	private String raca;
	private String personalidade;
	private double peso;
	private String condicoes;
	private double altura;
	private final int id;
	private static int contador;
	private static List<Animal> listaAnimais = new ArrayList<>();
	
	public Animal(){
		super();
		
		contador++;
		id = contador;
	}
	
	public Animal(String nome, int idade, String raca, String personalidade, double peso, String condicoes, double altura){
		super(nome, idade);
		this.raca = raca;
		this.personalidade = personalidade;
		this.peso = peso;
		this.condicoes = condicoes;
		this.altura = altura;
		
		contador++;
		id = contador;
	}
	
	public String pegarPorte() {
		return "PlaceHolder";
	}
	
	@Override
	public String registrar() {
		return "PlaceHolder";
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
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

	public String getCondicoes() {
		return condicoes;
	}

	public void setCondicoes(String condicoes) {
		this.condicoes = condicoes;
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

	
}
