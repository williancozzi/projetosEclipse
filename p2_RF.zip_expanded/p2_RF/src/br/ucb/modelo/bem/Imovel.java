package br.ucb.modelo.bem;

import br.ucb.modelo.pessoa.Pessoa;
import br.ucb.modelo.tipo.ImovelEnum;

public class Imovel extends Bem {
	private static final long serialVersionUID = 1L;
	private String endereco;
	private ImovelEnum tipo;
	
	public Imovel() {
	}
	
	public Imovel(float valor, Pessoa proprietario, String endereco, ImovelEnum tipo) {
		super(valor, proprietario);
		this.endereco = endereco;
		this.tipo = tipo;
	}

	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public ImovelEnum getTipo() {
		return tipo;
	}
	
	public void setTipo(ImovelEnum tipo) {
		this.tipo = tipo;
	}

}
