import br.ucb.got.Casa;
import br.ucb.got.Reino;

public class Principal {

	public static void main(String[] args) {
		Reino reino = new Reino();
		
		reino.cadastrar(new Casa("A","a",5000));
		reino.cadastrar(new Casa("B","b",1000));
		reino.cadastrar(new Casa("C","c",1000));
		
		reino.listar();
		
		System.out.println("--> "+ reino.getSoldados());
	}

}
