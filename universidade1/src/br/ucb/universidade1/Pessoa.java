package br.ucb.universidade1;

import java.io.Serializable;

public abstract class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	private String login;
	private String senha;
	private Curso curso;
	private boolean logado;
	
	public Pessoa() {

	}

	public Pessoa(String login, String senha, Curso curso, boolean logado) {
		this.login = login;
		this.senha = senha;
		this.curso = curso;
		this.logado = logado;
	}

	public boolean logar(String login, String senha, boolean logado) {
		if (this.login.equals(login) && this.senha.equals(senha)) {
			System.out.println("logado com sucesso");
			return logado = true;
		}else{
			System.out.println("erro de login");
			return false;
		}
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
