package br.ucb.l03e04;

import java.io.Serializable;

public class Ingresso implements Serializable {
	private final static long serialVersionUID = 1L;
	protected float valor;
	
	public Ingresso() {
		
	}

	public Ingresso(float valor) {
		this.valor = valor;
	}

	public String imprimirValor() {
		return "Valor Ingresso: R$"+valor;
	}
		
	public float getValor() {
		return valor;
	}
}
