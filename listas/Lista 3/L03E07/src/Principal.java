import br.ucb.l03e07.*;

public class Principal {

	public static void main(String[] args) {
		Rica rica = new Rica("joao", 22, 100);
		Pobre pobre = new Pobre("Flavio", 14);
		Miseravel miseravel = new Miseravel("Kleber", 55);
		
		System.out.println(rica.fazCompras());
		System.out.println(rica.toString());
		System.out.println(pobre.trabalha());
		System.out.println(miseravel.mendiga());
		
		
	}

}
