package br.ucb.l03e05;

import java.io.Serializable;

public class ImovelVelho extends Imovel implements Serializable{
	private final static long serialVersionUID = 1L;
	private float valorDesconto;
	
	public ImovelVelho() {
		super();
	}

	public ImovelVelho(String endereco, float preco, float valorDesconto) {
		super(endereco, preco);
		this.valorDesconto = valorDesconto;
	}
	
	public String toString() {
		float desconto = 0;
		desconto = preco - valorDesconto;
		return "Valor imóvel velho: "+desconto;
	}
	

}
