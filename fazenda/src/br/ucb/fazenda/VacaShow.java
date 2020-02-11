package br.ucb.fazenda;

import java.io.Serializable;

public class VacaShow extends Vaca implements Serializable{
	private static final long serialVersionUID = 1L;
	private int ecc;
	
	public VacaShow() {
		super();
	}
	
	public VacaShow(int id, int litros, int ecc) {
		super(id, litros);
		this.ecc = ecc;
	}
}
