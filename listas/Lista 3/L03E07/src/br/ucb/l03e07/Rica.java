package br.ucb.l03e07;

import java.io.Serializable;

public class Rica extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	private double dinheiro;
	
	public Rica() {
		super();
	}

	public Rica(String nome, int idade, double dinheiro) {
		this.nome = nome;
		this.idade = idade;
		this.dinheiro = dinheiro;
	}

	public boolean fazCompras() {
		if(this.dinheiro <= 0)
			return false;
		this.dinheiro--;
			return true;
	}

	public String toString() {
		return "Rica [dinheiro=" + dinheiro + ", nome=" + nome + ", idade=" + idade + "]";
	}
	
	
	


	

}

