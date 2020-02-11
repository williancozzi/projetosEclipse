package br.ucb.universidade1;

import java.io.Serializable;

public class Aluno extends Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	private float nota1;
	private float nota2;
	private float nota3;
	private float media;
	private boolean logado;
	public Aluno() {

	}

	public Aluno(Curso curso, String login, String senha, boolean logado, float nota1, float nota2, float nota3) {
		super(login, senha, curso, logado);
		this.logado = logado;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public float calcularMedia(float n1, float n2, float n3) {
		this.media = (n1+n2+n3)/3;
		return this.media;
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

	public float getNota3() {
		return nota3;
	}

	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	public boolean isLogado() {
		return logado;
	}

	public void setLogado(boolean logado) {
		this.logado = logado;
	}
}
