package br.ucb.padaria;

public class Padeiro {
	private String nome;
	Pao pao;
	Forno forno;
	
	public Padeiro(String nome) {
		this.nome = nome;
	}
	
	public Pao fazerPao(String tipo, float peso, boolean assado) {
		this.pao = new Pao(tipo, peso, assado);
		return pao;
	}
	
	public void rechearPao(Pao pao) {
		pao.setTipo("recheado");
		pao.setPeso(200);
	}
	
	public void confeitarPao(Pao pao) {
		pao.setTipo("confeitado");
		pao.setPeso(250);
	}
	
	public void esculpirPao(Pao pao) {
		pao.setTipo("esculpido");
		pao.setPeso(150);
	}
	
/*	public Pao assarPao(Pao pao) {
		forno.assar();
		return pao;
	} 								*/

	public String getNome() {
		return nome;
	}


	
	
	
}
