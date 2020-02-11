package br.ucb.l03e09;

import java.io.Serializable;

public class Empregado extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	private int codigoSetor;
	protected float salarioBase;
	protected float imposto;
	
	public Empregado() {
		super();
	}

	public Empregado(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public float calcularSalario() {
		float desconto = 0;
		float salarioLiquido = 0;
		desconto = (this.salarioBase * this.imposto)/100;
		salarioLiquido = this.salarioBase - desconto;
		return salarioLiquido;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}

}
