package br.ucb.modelo;

import java.io.Serializable;

public class Rota implements Serializable {
	private static final long serialVersionUID = 1L;
	private String cidadeOrigem;
	private String ufOrigem;
	private String cidadeDestino;
	private String ufDestino;
	
	public Rota() {
	}

	public Rota(String cidadeOrigem, String ufOrigem, String cidadeDestino, String ufDestino) {
		this.cidadeOrigem = cidadeOrigem;
		this.ufOrigem = ufOrigem;
		this.cidadeDestino = cidadeDestino;
		this.ufDestino = ufDestino;
	}

	public String toString() {
		return "Rota [cidadeOrigem=" + cidadeOrigem + ", ufOrigem=" + ufOrigem + ", cidadeDestino=" + cidadeDestino
				+ ", ufDestino=" + ufDestino + "]";
	}

	public String getCidadeOrigem() {
		return cidadeOrigem;
	}

	public void setCidadeOrigem(String cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}

	public String getUfOrigem() {
		return ufOrigem;
	}

	public void setUfOrigem(String ufOrigem) {
		this.ufOrigem = ufOrigem;
	}

	public String getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}

	public String getUfDestino() {
		return ufDestino;
	}

	public void setUfDestino(String ufDestino) {
		this.ufDestino = ufDestino;
	}

}
