package br.ucb.padaria;

public class Forno {
	Botijao botijao;
	Pao pao;
	Gerente gerente;
	
	public Forno() {
		
	}
	
	public void assar() {
		if (this.botijao.getQuantidade()<1) {
			this.botijao.fornecer(1);
			pao.setAssado(true);
		} else {
			this.solicitarTroca();
		}
	}
	
	public void solicitarTroca() {
		if (this.botijao.getQuantidade()<=1) {
			System.out.println("Gás acabando. Favor Trocar");
		} else {
			System.out.println(botijao.getQuantidade());
		}
	}
}
