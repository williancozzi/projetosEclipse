package br.ucb.l03e10;

import java.io.Serializable;

public class Inseto extends Humano implements Serializable{
	private static final long serialVersionUID = 1L;
	private String nome;
	private boolean venenoso;
	private boolean alado;
	private boolean ferrao;
	
	public Inseto() {
		
	}

	public Inseto(String nome, boolean venenoso, boolean alado, boolean ferrao) {
		this.nome = nome;
		this.venenoso = venenoso;
		this.alado = alado;
		this.ferrao = ferrao;
	}
	
	public String toString() {
		return "Inseto [nome=" + nome + ", venenoso=" + venenoso + ", alado=" + alado + ", ferrao=" + ferrao + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	public boolean isAlado() {
		return alado;
	}

	public void setAlado(boolean alado) {
		this.alado = alado;
	}

	public boolean isFerrao() {
		return ferrao;
	}

	public void setFerrao(boolean ferrao) {
		this.ferrao = ferrao;
	}

}
