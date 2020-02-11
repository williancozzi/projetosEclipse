package com.aula11;
public class Bolsista extends Aluno {
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("renovando bolsa de " + this.nome);
	}
	
	public void pagarMensal() {
		System.out.println(this.nome + " é bolsista, pagamento facilitado");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	
}
