package br.ucb.l03e06;

import java.io.Serializable;

public class Tecnico extends Funcionario implements Serializable{
	private static final long serialVersionUID = 1L;
	protected float bonusSalarial;

	public Tecnico() {
		super();
	}
	
	public Tecnico(String nome, int matricula, float salario, float bonus) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
		this.bonusSalarial = bonus;
	}

	public String exibirDados() {
		return "Tecnico [bonus=" + bonusSalarial + ", nome=" + nome + ", matricula=" + matricula + ", salario="
				+ salario + "]";
	}

	
	
	
	
}
