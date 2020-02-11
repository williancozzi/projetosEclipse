package br.ucb.l03e02;

import java.io.Serializable;

public class Gato extends Animal implements Serializable{
	private final static long serialVersionUID = 1L;
	
	public Gato() {
		
	}
	
	public String mia() {
		return "Miou";
	}
	
}
