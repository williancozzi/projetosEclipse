package br.ucb.padaria;

public class Gerente {
	Botijao botijao;
	
	public Gerente() {
		
	}
	
	public Botijao trocarBotijao(int quantidade) {
		this.botijao = new Botijao(quantidade);
		return this.botijao;
	}
		
}
