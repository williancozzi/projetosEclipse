import br.ucb.fazenda.*;

public class Teste {
	public static void main(String args[]) {
		Fazenda fazenda = new Fazenda();
		Tanque t1 = new Tanque(50, 0);
		VacaShow vaca1 = new VacaShow(1, 22, 5);
		
		vaca1.ordenhar(2);
		System.out.println(t1.getQtdLitros());
		System.out.println(vaca1.getLitros());
		vaca1.ordenhar(25);
		
		fazenda.mostrarVacas();
		
	}
}

