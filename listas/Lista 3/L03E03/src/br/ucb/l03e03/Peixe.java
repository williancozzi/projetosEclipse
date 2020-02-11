package br.ucb.l03e03;

import java.io.Serializable;

public class Peixe extends Animal implements Serializable{
	private final static long serialVersionUID = 1L;
	private String tipoHabitat;
	
	public Peixe() {
		super();
	}
	
	public Peixe(String tipoHabitat, double peso, String nome) {
		super(nome, peso);
		this.tipoHabitat = tipoHabitat;
	}
	
	private String getTipoHabitat() {
		return tipoHabitat;
	}
	private void setTipoHabitat(String tipoHabitat) {
		this.tipoHabitat = tipoHabitat;
	}
	
	public String toString() {
		return "Nome: "+getNome()+
				"\nPeso: "+getPeso()+
				"\nTipo de Habitat: "+tipoHabitat;
		
	}
}
