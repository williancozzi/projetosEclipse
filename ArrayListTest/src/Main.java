import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Pessoa manu = new Pessoa("manu");
		Conta contaCrrnt = new Conta(555);		
		Conta poupanca = new Conta(111);
		manu.addConta(poupanca);
		manu.addConta(contaCrrnt);
		manu.listarContas();
		
	}

}
