package br.ucb.banco;

import java.io.Serializable;

public class ContaCorrente implements Serializable {
	private static final long serialVersionUID = 1L;
	protected float saldo;
	
	public ContaCorrente() {
	}

	public ContaCorrente(float saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(float valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(float valor) {
		if (valor > this.saldo)
			return false;
		this.saldo -= valor;
		return true;
	}
	
	public boolean transferir(ContaCorrente conta, float valor) {
		if (!this.sacar(valor))
			return false;
		conta.depositar(valor);
		return true;
	}

	public String toString() {
		return "ContaCorrente [saldo=" + saldo + "]";
	}

	public float getSaldo() {
		return saldo;
	}

}
