package br.ucb.escola;

import java.io.Serializable;

public class Professor extends Pessoa implements Usuario, Serializable {
	private static final long serialVersionUID = 1L;
	
	public Professor() {
	}

	public Professor(String login, String senha) {
		super(login, senha);
	}


}
