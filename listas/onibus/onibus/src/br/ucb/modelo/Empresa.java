package br.ucb.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Rota> rotas;
	
	public Empresa() {
		this.rotas = new ArrayList<Rota>();
	}
	
	public void adicionarRota(Rota rota) {
		this.rotas.add(rota);
	}
	
	public boolean removerRota(Rota rota) {
		return this.rotas.remove(rota);
	}
	
	public boolean removerRota(int posicao) {
		try {
			this.rotas.remove(posicao);
			return true;
		} catch (IndexOutOfBoundsException e) {
			return false;
		}
	}
	
	public Rota getRota(int posicao) {
		return this.rotas.get(posicao);
	}
	
	public void editarRota(Rota rota, int posicao) {
		this.rotas.remove(posicao);
		this.rotas.add(posicao, rota);
	}

}
