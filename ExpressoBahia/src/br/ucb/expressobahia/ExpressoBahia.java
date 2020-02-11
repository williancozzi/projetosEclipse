package br.ucb.expressobahia;

import java.io.Serializable;
import java.util.ArrayList;

public class ExpressoBahia implements Serializable {
	
	private static final long serialVersionUID = 1l;
	private ArrayList <Rota> rotas; //classe Rota
	
	public ExpressoBahia() 
	{
		this.rotas = new ArrayList<Rota>();
	}
	
	public void cadastrarRota(Rota rota) 
	{
		this.rotas.add(rota);
	}
	private boolean venderPassagem () 
	{
		return false;
	}

	public ArrayList<Rota> getRotas() {
		return rotas;
	}
	
	
	
}
