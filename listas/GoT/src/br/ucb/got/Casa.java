package br.ucb.got;

import java.io.Serializable;

public class Casa implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nome;
	private String lordLady;
	private int soldados;
	private int moedas;
	
	public Casa() {
	}

	public Casa(String nome, String lordLady, int soldados) {
		this.nome = nome;
		this.lordLady = lordLady;
		this.soldados = soldados;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLordLady() {
		return lordLady;
	}

	public void setLordLady(String lordLady) {
		this.lordLady = lordLady;
	}

	public int getSoldados() {
		return soldados;
	}

	public void setSoldados(int soldados) {
		this.soldados = soldados;
	}

	public int getMoedas() {
		return moedas;
	}

	public void setMoedas(int moedas) {
		this.moedas = moedas;
	}

}
