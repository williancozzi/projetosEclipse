package br.ucb.escola;

import java.io.Serializable;

public class Aluno extends Pessoa implements Usuario, Serializable {
	private static final long serialVersionUID = 1L;

	public Aluno() {
	}

	public Aluno(String login, String senha) {
		super(login, senha);
	}

}
