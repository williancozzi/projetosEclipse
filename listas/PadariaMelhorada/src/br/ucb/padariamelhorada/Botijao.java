package br.ucb.padariamelhorada;

import java.io.Serializable;

public class Botijao implements Serializable{
	private static final long serialVersionUID = 1L;
	protected int quantidade;

	public Botijao() {
		
	}
	
	public Botijao(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public boolean fornecer() {
		if(this.quantidade<=0) 
			return false;
		this.quantidade--;
			return true;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
