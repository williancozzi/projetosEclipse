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
	
	public Contato buscar(String nome) {
		for (int i=0; i<this.quantidade; i++)
			if (nome.equals(this.contatos[i].getNome()))
				return this.contatos[i];
		return null;
	}
	
	public boolean removerContato(Contato contato) {
		for (int i=0; i<this.quantidade; i++)
			if (contato == this.contatos[i]) {
				this.contatos[i] = this.contatos[this.quantidade-1];
				this.contatos[this.quantidade-1] = null;
				this.quantidade--;
				return true;
			}
		return false;
	}
	
	
	
	

}
