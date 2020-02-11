package br.ucb.l03e08;

import java.io.Serializable;

public class Empregado extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	private double salario;
	private String matricula;
	
	public Empregado(){
		super();
	}

	public Empregado(String nome, int idade, String sexo, double salario, String matricula) {
		super(nome, idade, sexo);
		this.salario = salario;
		this.matricula = matricula;
	}
	
	public double valorInss(double salario){
		double valor = 0;
		valor = salario*0.11;
		return valor;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
