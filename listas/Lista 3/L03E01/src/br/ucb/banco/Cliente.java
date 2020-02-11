package br.ucb.banco;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nome;
	private List<ContaCorrente> contas;
	
	public Cliente() {
		this.contas = new ArrayList<ContaCorrente>();
				
	}

	public Cliente(String nome, ContaCorrente conta) {
		this();
		this.nome = nome;
		this.contas.add(conta);
	}
	
	public void adicionarConta(ContaCorrente conta) {
		this.contas.add(conta);
	}

	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
