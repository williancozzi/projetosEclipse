package br.ucb.agenda;

public class Principal {

	public static void main(String[] args) {
		Agenda agenda = new Agenda(5);
		
		System.out.println("--> "+ agenda.adicionarContato("Edson", "1"));
		System.out.println("--> "+ agenda.adicionarContato("Auc�lio", "2"));
		System.out.println("--> "+ agenda.adicionarContato("Diego", "3"));
		System.out.println("--> "+ agenda.adicionarContato("Felipe", "4"));
		System.out.println("--> "+ agenda.adicionarContato("Fernando", "5"));
		System.out.println("--> "+ agenda.adicionarContato("Daniel", "6"));
		
		System.out.println("-----------------------------------------");
		
		Contato contato = agenda.buscar("Edson");
		if (contato == null)
			System.out.println("N�o encontrado!");
		else
			System.out.println("--> "+ contato.getTelefone());
		
		System.out.println("Exclusao --> "+	agenda.removerContato(contato));
		
		contato = agenda.buscar("Edson");
		if (contato == null)
			System.out.println("N�o encontrado!");
		else
			System.out.println("--> "+ contato.getTelefone());
		
		System.out.println("--> "+ agenda.adicionarContato("Daniel", "6"));
			
		contato = agenda.buscar("Daniel");
		if (contato == null)
			System.out.println("N�o encontrado!");
		else
			System.out.println("--> "+ contato.getTelefone());
		
		
		

	}

}
