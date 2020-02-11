import br.ucb.l03e03.Cachorro;
import br.ucb.l03e03.Peixe;

public class Principal {
	public static void main(String[] args) {
		
		Peixe peixe = new Peixe("agua", 20, "peixinho");
		Cachorro dog = new Cachorro("fox", 50, "tobby");
		
		System.out.println(peixe.toString());
		System.out.println();
		System.out.println(dog.toString());
	}
}
