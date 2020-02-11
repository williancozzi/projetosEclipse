package br.ucb.l03e04;

import java.io.Serializable;

public class Normal extends Ingresso implements Serializable {
	private final static long serialVersionUID = 1L;
	
	public Normal() {
		super();
	}
	
	public Normal(float valor) {
		super(valor);
	}
	
	public String toString() {
		return "Ingresso normal";
	}
		
}
