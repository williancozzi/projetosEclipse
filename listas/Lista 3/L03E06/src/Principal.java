import br.ucb.l03e06.*;

public class Principal {
	public static void main(String[] args) {
		Administrativo a1 = new Administrativo("will", 9, 2200, 550);
		System.out.println(a1.exibirDados());
		
		Tecnico t1 = new Tecnico("davi", 23, 3232, 1000);
		System.out.println(t1.exibirDados());
		
		
	}
}
