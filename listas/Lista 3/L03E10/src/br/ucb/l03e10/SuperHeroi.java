package br.ucb.l03e10;

import java.io.Serializable;

public class SuperHeroi extends Inseto implements Serializable{
	private static final long serialVersionUID = 1L;
	private String codinome;
	private String trauma;
	private String poderes;
	
	public SuperHeroi() {
		
	}

	public SuperHeroi(String codinome, String trauma, String poderes) {
		super();
		this.codinome = codinome;
		this.trauma = trauma;
		this.poderes = poderes;
	}

	public String toString() {
		return "SuperHeroi [codinome=" + codinome + ", trauma=" + trauma + ", poderes=" + poderes + "]";
	}

	public String getCodinome() {
		return codinome;
	}

	public void setCodinome(String codinome) {
		this.codinome = codinome;
	}

	public String getTrauma() {
		return trauma;
	}

	public void setTrauma(String trauma) {
		this.trauma = trauma;
	}

	public String getPoderes() {
		return poderes;
	}

	public void setPoderes(String poderes) {
		this.poderes = poderes;
	}
	
	
	
}
