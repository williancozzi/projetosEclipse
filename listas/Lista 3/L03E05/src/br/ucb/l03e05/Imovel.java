package br.ucb.l03e05;

import java.io.Serializable;

public class Imovel implements Serializable{
	private final static long serialVersionUID = 1L;
	protected String endereco;
	protected float preco;
	
	public Imovel() {
		
	}
	
	public Imovel(String endereco, float preco) {
		this.endereco = endereco;
		this.preco = preco;
	}
	
	
}
