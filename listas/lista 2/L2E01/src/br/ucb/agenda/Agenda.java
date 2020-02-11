package br.ucb.agenda;

public class Agenda {
	private Contato[] contatos;
	private int quantidade;
	
	public Agenda(int tamanho) {
		this.contatos = new Contato[tamanho];
	}
	
	public boolean adicionarContato(String nome, String telefone) {
		if (this.quantidade == this.contatos.length)
			return false;
		this.contatos[this.quantidade++] = new Contato(nome, telefone);
		return true;
	}
	
}
