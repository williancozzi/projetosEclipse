package br.ucb.fazenda;

import java.io.Serializable;

public class Vaca implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private int litros;
	private Tanque tanque;

	public Vaca() {

	}

	public Vaca(int id, int litros) {
		this.id = id;
		this.litros = litros;
	}

	public boolean ordenhar(int litros) {
		if (this.litros<=0) {
			return false;
		}else {
			this.litros = this.litros-litros;
			return true;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLitros() {
		return litros;
	}

}
