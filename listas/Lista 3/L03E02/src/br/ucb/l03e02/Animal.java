package br.ucb.l03e02;

import java.io.Serializable;

public class Animal implements Serializable{
	private final static long serialVersionUID = 1L;
	private String nome;
	private String raca;
	
	public Animal() {
	}
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public String caminha() {
		return "Caminhou";
	}
	
	
	
}
