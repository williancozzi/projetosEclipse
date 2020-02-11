package br.ucb.l03e03;

import java.io.Serializable;

public class Cachorro extends Animal implements Serializable {
	private final static long serialVersionUID = 1L;
	private String raca;
	
	public Cachorro() {
		super();
	}
	
	public Cachorro(String raca, double peso, String nome) {
		super(nome, peso);
		this.raca = raca;
	}
	
	private String getRaca() {
		return raca;
	}
	private void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String toString() {
		return "Nome: "+getNome()+
				"\nPeso: "+getPeso()+
				"\nRaça: "+raca;
	}
	
}
