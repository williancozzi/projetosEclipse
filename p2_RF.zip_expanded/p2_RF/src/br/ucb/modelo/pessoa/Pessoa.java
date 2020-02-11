package br.ucb.modelo.pessoa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.ucb.modelo.bem.Bem;
import br.ucb.modelo.renda.FonteRenda;

public abstract class Pessoa implements Serializable  {
	private static final long serialVersionUID = 1L;
	private List<Bem> bens;
	private List<FonteRenda> rendas;
	
	public Pessoa() {
		this.bens = new ArrayList<Bem>();
		this.rendas = new ArrayList<FonteRenda>();
	}
	
	public void adicionarBem(Bem bem) {
		this.bens.add(bem);
	}

	public void adicionarFonteRenda(FonteRenda fonteRenda) {
		this.rendas.add(fonteRenda);
	}
	
	public float calcularTotalBens() {
		float soma=0;
		for (Bem bem : this.bens)
			soma += bem.getValor();
		return soma;
	}
	
	public float calcularValorRecebido() {
		float soma=0;
		for (FonteRenda renda : this.rendas)
			soma += renda.getValorRecebido();
		return soma;
	}
	
	public float calcularImpostoPago() {
		float soma=0;
		for (FonteRenda renda : this.rendas)
			soma += renda.getImpostoPago();
		return soma;
	}
	
	public float calcularImpostoDevido() {
		float soma=0;
		for (FonteRenda renda : this.rendas)
			soma += renda.calcularImpostoDevido();
		return soma;
	}
	
	public List<Bem> getBens() {
		return bens;
	}

	public void setBens(List<Bem> bens) {
		this.bens = bens;
	}

	public List<FonteRenda> getRendas() {
		return rendas;
	}

	public void setRendas(List<FonteRenda> rendas) {
		this.rendas = rendas;
	}

}
