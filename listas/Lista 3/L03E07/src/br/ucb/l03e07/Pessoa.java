package br.ucb.l03e07;

import java.io.Serializable;

public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	protected String nome;
	protected int idade;
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private int getIdade() {
		return idade;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}	
}
