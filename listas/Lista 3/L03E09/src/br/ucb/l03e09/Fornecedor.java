package br.ucb.l03e09;

import java.io.Serializable;

public class Fornecedor extends Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	private float valorCredito;
	private float valorDivida;
	
	public Fornecedor() {
		super();
	}

	public Fornecedor(String nome, String endereco, String telefone, float valorCredito, float valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public float obterSaldo() {
		float saldo = 0;
		saldo = this.valorCredito - this.valorDivida;
		return saldo;
	}

	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}

}
