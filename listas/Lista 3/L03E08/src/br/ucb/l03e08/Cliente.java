package br.ucb.l03e08;

import java.io.Serializable;

public class Cliente extends Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	private double valorDivida;
	private int anoNasc;
	
	public Cliente(){
		super();
	}

	public Cliente(String nome, int idade, String sexo, double valorDivida, int anoNasc) {
		super(nome, idade, sexo);
		this.valorDivida = valorDivida;
		this.anoNasc = anoNasc;
	}

	public String toString() {
		return "Cliente [valor divida=" + valorDivida + ", ano nascimento=" + anoNasc
				+ ", Nome=" + getNome() + ", Idade=" + getIdade()
				+ ", Sexo=" + getSexo() + "]";
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}	

}
