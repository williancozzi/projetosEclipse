package br.ucb.teste;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Escola implements Serializable{
	private static final long serialVersionUID = 1L;
	private List<Aluno> alunos;
	
	public Escola() {
		this.alunos = new ArrayList<Aluno>();
	}
	
	public void cadastrarAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
}
