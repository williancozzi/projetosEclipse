package br.ucb.l03e02;

import java.io.Serializable;

public class Cachorro extends Animal implements Serializable{
	private final static long serialVersionUID = 1L;
	
	public Cachorro() {
		
	}
	
	public String late() {
		return "Latiu";
	}
	
}
