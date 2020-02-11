package br.ucb.l03e07;

import java.io.Serializable;

public class Miseravel extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public Miseravel() {
		super();
	}
	
	public Miseravel(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String mendiga() {
		return "Miseravel [nome=" + nome + ", idade=" + idade + "] mendiga";
	}
	
	
}
