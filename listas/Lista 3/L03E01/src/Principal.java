import br.ucb.banco.Cliente;
import br.ucb.banco.ContaCorrente;
import br.ucb.banco.ContaEspecial;

public class Principal {

	public static void main(String[] args) {
		ContaCorrente contaEdson = new ContaCorrente(1000);
		ContaEspecial conta2Edson = new ContaEspecial(0, 10000);
		Cliente edson = new Cliente("Edson", contaEdson);
		edson.adicionarConta(conta2Edson);
		
		System.out.println(edson.toString());
		System.out.println(contaEdson.toString());
		contaEdson.sacar(700);
		System.out.println(contaEdson.toString());
		contaEdson.depositar(100);
		System.out.println(contaEdson.toString());
		contaEdson.sacar(900);
		System.out.println(contaEdson.toString());
		System.out.println("------");
		System.out.println(conta2Edson.toString());
		conta2Edson.sacar(5000);
		System.out.println(conta2Edson.toString());
		conta2Edson.sacar(6000);
		System.out.println(conta2Edson.toString());
	}

}
