package br.ucb.l03e06;

import java.io.Serializable;

public class Assistente extends Funcionario implements Serializable {
	private static final long serialVersionUID = 1L;

	public Assistente() {
		super();
	}
	
	public Assistente(String nome, int matricula, float salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
	}

	public String exibirDados() {
		return "Assistente [nome=" + nome + ", matricula=" + matricula + ", salario=" + salario + "]";
	}
	
	
}
