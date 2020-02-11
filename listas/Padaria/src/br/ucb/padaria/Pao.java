package br.ucb.padaria;

public class Pao {
	private String tipo;
	private float peso;
	private boolean assado;
	
	public Pao(String tipo, float peso, boolean assado) {
		this.tipo = tipo;
		this.peso = peso;
		this.assado = assado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public boolean isAssado() {
		return assado;
	}

	public void setAssado(boolean assado) {
		this.assado = assado;
	}
	
	
}
