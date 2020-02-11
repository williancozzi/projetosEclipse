package br.ucb.l03e04;

import java.io.Serializable;

public class CamaroteInferior extends Vip implements Serializable {
	private final static long serialVersionUID = 1L;
	private String localizacao;
	
	public CamaroteInferior() {
		super();
	}

	public CamaroteInferior(String localizacao, float valorAdicional, float valor) {
		super(valorAdicional, valor);
		this.localizacao = localizacao;
	}
	
	public String imprimirValor() {
		return "Valor Ingresso: R$"+imprimirValor();
	}
	
	public String mostraLocalizacao() {
		return "Local: "+this.localizacao;
	}
		
}
