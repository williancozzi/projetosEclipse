package br.ucb.universidade1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	private List<Aluno> alunos;
	private boolean logado;


	public Professor() {

	}

	public Professor(Curso curso, String login, String senha, boolean logado) {
		super(login, senha, curso, logado);
		this.alunos = new ArrayList<Aluno>();
		this.logado = logado;
	}

	public void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public void mostrarAlunos() {
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getMedia());
			System.out.println(aluno.isLogado());
			System.out.println(aluno.getCurso()+"\n");
		}
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public boolean isLogado() {
		return logado;
	}

	public void setLogado(boolean logado) {
		this.logado = logado;
	}

}
