import br.ucb.campeonato.Campeonato;

public class Principal {

	public static void main(String[] args) {
		Campeonato campeonato = new Campeonato();
		
		campeonato.cadastrarTime("Palmeiras");
		campeonato.cadastrarTime("Santos");
		campeonato.cadastrarTime("Flamengo");
		campeonato.cadastrarTime("Vasco");
		
		campeonato.listarTimes();
		
		campeonato.cadastrarJogo("Brasília", "Palmeiras", 2, "Santos", 1);
		campeonato.cadastrarJogo("Rio de Janeiro", "Flamengo", 0, "Vasco", 5);
		
		campeonato.listarJogos();
		campeonato.listarTimes();
		
		campeonato.computarVencedor();
		System.out.println("Campeão: "+ campeonato.getVencedor().getNome());
		

	}

}
