package br.ucb.expressobahia;

import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JTextField;

public class Rota implements Serializable {
	
	private static final long serialVersionUID = 1l;

	private String origem;
	private String destino;
	private ArrayList<Saida> saidas;
	
	public Rota () {
		this.saidas = new ArrayList<Saida>();
	}

	public Rota(String txtOrigem, String txtDestino) {
		this();
		this.origem = txtOrigem;
		this.destino = txtDestino;
	}

	private void cadastrarSaida() 
	{
		
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}


	
	
}
