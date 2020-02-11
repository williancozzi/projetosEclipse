package br.ucb.l03e08;

import java.io.Serializable;

public class Vendedor extends Empregado implements Serializable{
	private static final long serialVersionUID = 1L;
	private double valorVendas;
	private int qtdVendas;
	
	public Vendedor(){
		super();
	}

	public Vendedor(String nome, int idade, String sexo, double salario, String matricula, double valorVendas, int qtdVendas) {
		super(nome, idade, sexo, salario, matricula);
		this.valorVendas = valorVendas;
		this.qtdVendas = qtdVendas;
	}

	public String toString() {
		return "Vendedor [valor Vendas=" + valorVendas + ", qtd Vendas="
				+ qtdVendas + ", Salario=" + getSalario() + ", Nome="
				+ getNome() + "]";
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public int getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}
	
	
	
}
