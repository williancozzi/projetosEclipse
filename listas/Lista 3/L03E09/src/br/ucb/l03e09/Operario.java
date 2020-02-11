package br.ucb.l03e09;

import java.io.Serializable;

public class Operario extends Empregado implements Serializable {
	private static final long serialVersionUID = 1L;
	private float valorProducao;
	private float comissao;
	
	public Operario() {
		super();
	}

	public Operario(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto, float valorProducao, float comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public float calcularSalario() {
		float desconto = 0;
		float salarioLiquido = 0;
		float comissaoRecebida = 0;
		desconto = (this.salarioBase * this.imposto)/100;
		comissaoRecebida = (this.valorProducao * this.comissao)/100;
		salarioLiquido = (this.salarioBase - desconto)+comissaoRecebida;
		return salarioLiquido;
	}

	public float getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(float valorProducao) {
		this.valorProducao = valorProducao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
}
