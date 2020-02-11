package br.ucb.modelo.bem;

import br.ucb.modelo.pessoa.Pessoa;

public class Veiculo extends Bem {
	private static final long serialVersionUID = 1L;
	public static int CARRO=1;
	public static int MOTO=2;
	public static int EMBARCACAO=3;
	public static int AERONAVE=4;
	private String descricao;
	private int tipo;
	
	public Veiculo() {
	}

	public Veiculo(float valor, Pessoa proprietario, String descricao, int tipo) {
		super(valor, proprietario);
		this.descricao = descricao;
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}