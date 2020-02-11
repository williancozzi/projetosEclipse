package br.ucb.modelo.renda;

import java.io.Serializable;

import br.ucb.modelo.tipo.FonteRendaEnum;

public class FonteRenda implements Serializable {
	private static final long serialVersionUID = 1L;
	private static float IMPOSTO_PORCENTAGEM = 17.5f;
	private float valorRecebido;
	private float impostoPago;
	private FonteRendaEnum tipo;
	
	public FonteRenda() {
	}
	
	public FonteRenda(float valorRecebido, float impostoPago, FonteRendaEnum tipo) {
		super();
		this.valorRecebido = valorRecebido;
		this.impostoPago = impostoPago;
		this.tipo = tipo;
	}

	public float calcularImpostoDevido() {
		return (this.valorRecebido * FonteRenda.IMPOSTO_PORCENTAGEM / 100) - this.impostoPago;
	}

	public float getValorRecebido() {
		return valorRecebido;
	}

	public void setValorRecebido(float valorRecebido) {
		this.valorRecebido = valorRecebido;
	}

	public float getImpostoPago() {
		return impostoPago;
	}

	public void setImpostoPago(float impostoPago) {
		this.impostoPago = impostoPago;
	}

	public FonteRendaEnum getTipo() {
		return tipo;
	}

	public void setTipo(FonteRendaEnum tipo) {
		this.tipo = tipo;
	}

}
