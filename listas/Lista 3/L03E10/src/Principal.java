import br.ucb.l03e10.*;

public class Principal {

	public static void main(String[] args) {
		Humano humano = new Humano("joao", "m", 22, "pt-br", "brasileiro");
		System.out.println(humano.toString());
		System.out.println();
		Inseto inseto = new Inseto("abelha", false, false, true);
		System.out.println(inseto.toString());
		System.out.println();
		SuperHeroi batman = new SuperHeroi("batman", "morte dos pais", "riqueza");
		System.out.println(batman.toString());
		
	}

}
