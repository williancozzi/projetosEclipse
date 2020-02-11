package br.ucb.agenda;

public class Principal {
	public static void main(String[] args) {
		
		Agenda agenda = new Agenda(5);
		
		System.out.println("--> "+ agenda.adicionarContato("Edson", "1"));
		System.out.println("--> "+ agenda.adicionarContato("Aucélio", "2"));
		System.out.println("--> "+ agenda.adicionarContato("Diego", "3"));
		System.out.println("--> "+ agenda.adicionarContato("Felipe", "4"));
		System.out.println("--> "+ agenda.adicionarContato("Fernando", "5"));
		System.out.println("--> "+ agenda.adicionarContato("Daniel", "6"));
		
		System.out.println("-----------------------------------------");
		
		

	}
}
