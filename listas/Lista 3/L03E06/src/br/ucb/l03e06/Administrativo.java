package br.ucb.l03e06;

import java.io.Serializable;

public class Administrativo extends Funcionario implements Serializable{
	private static final long serialVersionUID = 1L;
	protected float adicionalNoturno;
	
	public Administrativo() {
		super();
	}
	
	public Administrativo(String nome, int matricula, float salario, float adicionalNoturno) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
		this.adicionalNoturno = adicionalNoturno;
	}

	public String exibirDados() {
		return "Administrativo [adicional noturno=" + adicionalNoturno + ", nome=" + nome + ", matricula=" + matricula
				+ ", salario=" + salario + "]";
	}

	private float getAdicionalNoturno() {
		return adicionalNoturno;
	}

	private void setAdicionalNoturno(float adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}
	
	
	
}
