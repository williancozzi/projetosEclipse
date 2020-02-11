package br.ucb.padariamelhorada;

import java.io.Serializable;

public class Padeiro implements Serializable{
	private static final long serialVersionUID = 1L;
	private String nome;
	private Pao pao;
	private Forno forno;

	public Padeiro() {
		
	}
	
	public Padeiro(String nome) {
		this.nome = nome;
	}
	
	public Pao fazerPao(String tipo, float peso, boolean assado) {
		this.pao = new Pao(tipo, peso, assado);
		return pao;
	}

}