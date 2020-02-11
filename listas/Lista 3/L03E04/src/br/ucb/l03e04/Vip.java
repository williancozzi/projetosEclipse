package br.ucb.l03e04;

import java.io.Serializable;

public class Vip extends Ingresso implements Serializable {
	private final static long serialVersionUID = 1L;
	private float valorAdicional;
	
	public Vip() {
		super();
	}

	public Vip(float valorAdicional, float valor) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}
	
	public String mostrarValorVip() {
		return "Valor VIP: R$"+(valorAdicional);
	}
	
}
