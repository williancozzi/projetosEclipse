package br.ucb.fazenda;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Fazenda implements Serializable{
	private static final long serialVersionUID = 1L;
	private List<Vaca> vacas;

	public Fazenda() {
		this.vacas = new ArrayList<Vaca>(); 
		this.vacas.add(new VacaShow(1, 20, 5));
	}

	public void mostrarVacas() {
		for (Vaca vacas : vacas) {
			System.out.println(vacas);
		}
	}

	
}
