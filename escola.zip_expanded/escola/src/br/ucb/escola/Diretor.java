package br.ucb.escola;

import java.io.Serializable;

public class Diretor extends Pessoa implements Usuario, Serializable {
	private static final long serialVersionUID = 1L;
	
	public Diretor() {
	}
	
	public Diretor(String login, String senha) {
		super(login, senha);
	}

}
