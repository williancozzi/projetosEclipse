package br.ucb.padaria;

public class Botijao {
	private int quantidade;

	public Botijao(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public boolean fornecer(int quantidade) {
		if (this.quantidade <= 0) {
			return false;
		} else {
			this.quantidade = this.quantidade - quantidade;
			return true;
			
		}
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
