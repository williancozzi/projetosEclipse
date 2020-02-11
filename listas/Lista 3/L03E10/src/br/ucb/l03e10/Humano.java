package br.ucb.l03e10;

import java.io.Serializable;

public class Humano implements Serializable{
	private static final long serialVersionUID = 1L;
	private String nome;
	private String sexo;
	private int idade;
	private String lingua;
	private String etnia;
	
	public Humano() {
		
	}

	public Humano(String nome, String sexo, int idade, String lingua, String etnia) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.lingua = lingua;
		this.etnia = etnia;
	}

	public String toString() {
		return "Humano [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", lingua=" + lingua + ", etnia="
				+ etnia + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getLingua() {
		return lingua;
	}

	public void setLingua(String lingua) {
		this.lingua = lingua;
	}

	public String getEtnia() {
		return etnia;
	}

	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}

}
