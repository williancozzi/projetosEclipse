package br.ucb.l03e09;

import java.io.Serializable;

public class Administrador extends Empregado implements Serializable {
	private static final long serialVersionUID = 1L;
	private float ajudaDeCusto;
	
	public Administrador() {
		super();
	}

	public Administrador(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto, float ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public float calcularSalario() {
		float desconto = 0;
		float salarioLiquido = 0;
		desconto = (this.salarioBase * this.imposto)/100;
		salarioLiquido = (this.salarioBase - desconto)+this.ajudaDeCusto;
		return salarioLiquido;
	}

	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
}
