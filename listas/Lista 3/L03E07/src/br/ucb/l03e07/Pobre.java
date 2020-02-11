package br.ucb.l03e07;

import java.io.Serializable;

public class Pobre extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public Pobre() {
		super();
	}
	
	public Pobre(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String trabalha() {
		return "Pobre [nome=" + nome + ", idade=" + idade + "] está trabalhando";
	}	

}
