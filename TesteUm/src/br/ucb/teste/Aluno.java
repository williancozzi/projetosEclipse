package br.ucb.teste;

import java.io.Serializable;

public class Aluno extends Pessoa implements Serializable, Usuario{
	private static final long serialVersionUID = 1L;
	private float nota1;
	private float nota2;
	private float media;
	private String senha;

	public Aluno() {

	}

	public Aluno(String nome, float nota1, float nota2, String senha) {
		super(nome);
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.senha = senha;
	}

	public boolean logar(String senha) {
		if (this.senha.equals(senha)) {
			System.out.println("login efetuado");
			return true;
		}else {
			System.out.println("Senha inválida");
			return false;
		}
	}

	public float calcularMedia() {

		return media;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}
}
