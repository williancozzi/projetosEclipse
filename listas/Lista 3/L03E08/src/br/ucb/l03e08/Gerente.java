package br.ucb.l03e08;

import java.io.Serializable;

public class Gerente extends Empregado implements Serializable{
	private static final long serialVersionUID = 1L;
	String nomeGerencia;
	
	public Gerente(){
		super();
	}

	public Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia) {
		super(nome, idade, sexo, salario, matricula);
		this.nomeGerencia = nomeGerencia;
	}

	public String toString() {
		return "Gerente [nome Gerencia=" + nomeGerencia + ", Matricula="
				+ getMatricula() + ", Nome=" + getNome() + ", Idade="
				+ getIdade() + ", INSS=" + valorInss(this.getSalario()) +"]";
	}

	public String getNomeGerencia() {
		return nomeGerencia;
	}

	public void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}

}
