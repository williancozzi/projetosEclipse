package br.ucb.banco;

import java.io.Serializable;

public class ContaEspecial extends ContaCorrente implements Serializable {
	private static final long serialVersionUID = 1L;
	private float limite;
	
	public ContaEspecial() {
		super();
	}

	public ContaEspecial(float saldo, float limite) {
		super(saldo);
		this.limite = limite;
	}
	
	public boolean sacar(float valor) {
		if (valor > (super.saldo + this.limite))
			return false;
		super.saldo -= valor;
		return true;
	}

	public String toString() {
		return "ContaEspecial [limite=" + limite + ", saldo=" + saldo + "]";
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

}
