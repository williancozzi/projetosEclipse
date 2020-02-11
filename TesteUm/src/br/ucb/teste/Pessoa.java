package br.ucb.teste;

import java.io.Serializable;

public abstract class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nome;
	
	public Pessoa() {

	}

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
		
}
