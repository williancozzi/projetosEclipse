package br.ucb.l03e03;

import java.io.Serializable;

public class Animal implements Serializable {
	private final static long serialVersionUID = 1L;
	private String nome;
	private double peso;
	
	public Animal() {
		
	}
	
	public Animal(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	protected String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	protected double getPeso() {
		return peso;
	}

	private void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	
}
