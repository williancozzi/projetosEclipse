package br.ucb.padariamelhorada;

import java.io.Serializable;

public class Gerente implements Serializable{
	private static final long serialVersionUID = 1L;
	private Botijao botijao;
	
	public Gerente() {
		
	}
		
	public Botijao trocarBotijao(int quantidade) {
		this.botijao = new Botijao(quantidade);
		return this.botijao;
	}
}
