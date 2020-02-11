package br.ucb.modelo.bem;

import java.io.Serializable;

import br.ucb.modelo.pessoa.Pessoa;

public abstract class Bem implements Serializable {
	private static final long serialVersionUID = 1L;
	private float valor;
	private Pessoa proprietario;
	
	public Bem() {
	}

	public Bem(float valor, Pessoa proprietario) {
		this.valor = valor;
		this.proprietario = proprietario;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Pessoa getProprietario() {
		return proprietario;
	}

	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}

}
