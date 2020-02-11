package br.ucb.escola;

import java.io.Serializable;

public abstract class Pessoa implements Usuario, Serializable {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private String login;
	private String senha;
	
	public Pessoa() {
	}

	public Pessoa(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public boolean logar(String senha) {
		return this.senha.equals(senha);
	}
	
	public String getLogin() {
		return this.login;
	}

}
