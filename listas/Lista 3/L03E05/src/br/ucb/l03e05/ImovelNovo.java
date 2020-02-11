package br.ucb.l03e05;

import java.io.Serializable;

public class ImovelNovo extends Imovel implements Serializable{
	private final static long serialVersionUID = 1L;
	private float valorAdicional;
	
	public ImovelNovo() {
		super();
	}

	public ImovelNovo(String endereco, float preco, float valorAdicional) {
		super(endereco, preco);
		this.valorAdicional = valorAdicional;
	}
	
	public String toString() {
		float soma = 0;
		soma = preco + valorAdicional;
		return "Valor imóvel novo: "+soma;
	}
	
	

}
