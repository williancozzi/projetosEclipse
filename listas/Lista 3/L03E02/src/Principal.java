import br.ucb.l03e02.*;

public class Principal {
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Gato gato = new Gato();
		
		System.out.println("dog "+dog.late());
		System.out.println("gato "+gato.mia());
		System.out.println("dog "+dog.caminha());
		System.out.println("gato "+gato.caminha());
	}
}
