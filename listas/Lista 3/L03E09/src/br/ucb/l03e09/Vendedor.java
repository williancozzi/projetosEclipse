package br.ucb.l03e09;

import java.io.Serializable;

public class Vendedor extends Empregado implements Serializable {
	private static final long serialVersionUID = 1L;
	private float valorVendas;
	private float comissao;
	
	public Vendedor() {
		super();
	}

	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, float salarioBase, float imposto, float valorVendas, float comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	public float calcularSalario() {
		float desconto = 0;
		float salarioLiquido = 0;
		float comissaoRecebida = 0;
		desconto = (this.salarioBase * this.imposto)/100;
		comissaoRecebida = (this.valorVendas * this.comissao)/100;
		salarioLiquido = (this.salarioBase - desconto)+comissaoRecebida;
		return salarioLiquido;
	}

	public float getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

}
