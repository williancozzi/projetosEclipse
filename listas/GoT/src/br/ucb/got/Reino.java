package br.ucb.got;

import java.io.Serializable;

public class Reino implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final int LIMITE=100;
	private Casa aliados[];
	private int qtdAliados;
	private int soldados;
	private float bonus;
	
	public Reino() {
		this.aliados = new Casa[Reino.LIMITE];
		this.bonus = 0.5f;
	}
	
	public boolean cadastrar(Casa casa) {
		int moedas;
		if (this.qtdAliados == Reino.LIMITE)
			return false;
		this.aliados[this.qtdAliados++] = casa;
		moedas = (int) (0.1 * casa.getSoldados());
		moedas += 50 * (casa.getSoldados() / 1000);
		moedas += this.bonus * casa.getSoldados();
		this.bonus /= 2;
		casa.setMoedas(moedas);
		this.soldados += casa.getSoldados();
		return true;
	}
	
	public void listar() {
		for (int i=0; i<this.qtdAliados; i++)
			System.out.println("--> "+ this.aliados[i].getNome() +" - "+ this.aliados[i].getMoedas());
	}

	public int getSoldados() {
		return soldados;
	}

}
