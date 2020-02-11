package br.ucb.l03e06;

import java.io.Serializable;

public class Funcionario implements Serializable{
	private static final long serialVersionUID = 1L;
	protected String nome;
	protected int matricula;
	protected float salario;
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, int matricula, float salario) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
	}

	public String exibirDados() {
		return "Funcionario [nome=" + nome + ", matricula=" + matricula + ", salario=" + salario + "]";
	}

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private int getMatricula() {
		return matricula;
	}

	private void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	private float getSalario() {
		return salario;
	}

	private void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
