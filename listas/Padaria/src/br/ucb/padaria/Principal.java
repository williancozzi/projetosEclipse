package br.ucb.padaria;

public class Principal {
	public static void main(String[] args) {
		Padeiro padeiro1 = new Padeiro("José");
		Padeiro padeiro2 = new Padeiro("Enzo");
		Padeiro padeiro3 = new Padeiro("Lorenzo");
		Forno forno = new Forno();
		Gerente gerente = new Gerente();
		Botijao botijao = new Botijao(13);
		
		System.out.println("teste de qtd do botijao: "+botijao.getQuantidade());
		botijao.fornecer(5);
		System.out.println("teste de qtd do botijao: "+botijao.getQuantidade());
		
		System.out.println("\nsolicitada a troca do botijao");
		botijao = gerente.trocarBotijao(13);
		System.out.println("teste de qtd do botijao: "+botijao.getQuantidade());
	
		padeiro1.fazerPao("Simples", 100, false);
		
		System.out.println("\nO pão tem "+padeiro1.pao.getPeso()+" gramas, é do tipo "+padeiro1.pao.getTipo());
		System.out.println("Assado: "+padeiro1.pao.isAssado());
		
		padeiro1.rechearPao(padeiro1.pao);
	
		System.out.println("\nO pão tem "+padeiro1.pao.getPeso()+" gramas, é do tipo "+padeiro1.pao.getTipo());
		System.out.println("Assado: "+padeiro1.pao.isAssado());
	
		padeiro1.confeitarPao(padeiro1.pao);
	
		System.out.println("\nO pão tem "+padeiro1.pao.getPeso()+" gramas, é do tipo "+padeiro1.pao.getTipo());
		System.out.println("Assado: "+padeiro1.pao.isAssado());
	
		padeiro1.esculpirPao(padeiro1.pao);
		
		System.out.println("\nO pão tem "+padeiro1.pao.getPeso()+" gramas, é do tipo "+padeiro1.pao.getTipo());
		System.out.println("Assado: "+padeiro1.pao.isAssado());
	
		
	
	
	}
}
