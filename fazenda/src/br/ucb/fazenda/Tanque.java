package br.ucb.fazenda;

import java.io.Serializable;

public class Tanque implements Serializable{
	private static final long serialVersionUID = 1L;
	private int qtdMaxima;
	private int qtdLitros;

	public Tanque() {
	}

	public Tanque(int qtdMaxima, int qtdLitros) {
		this.qtdMaxima = qtdMaxima;
		this.qtdLitros = qtdLitros;
	}

	public boolean esvaziar() {
		if(this.qtdLitros <= 0)
			return false;
		this.qtdLitros = this.setQtdLitros(qtdMaxima);
		return true;
	}

	public int getQtdMaxima() {
		return qtdMaxima;
	}

	public int getQtdLitros() {
		return qtdLitros;
	}

	public int setQtdLitros(int qtdLitros) {
		return this.qtdLitros = qtdLitros;
	}
	

}
