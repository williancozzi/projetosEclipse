import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	protected String nome;
	protected List<Conta> contas;
	
	public Pessoa() {
		this.contas = new ArrayList<Conta>();
	}
	
	public Pessoa(String nome) {
		this();
		this.nome = nome;
	}
	
	public void addConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public void listarContas() {
		for (int i = 0; i < contas.size(); i++) {
			System.out.println("Conta de " + getNome() + " com saldo de " + contas.get(i).getSaldo()+" reais");
		}
	}

	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", contas=" + contas + "]";
	}

	private String getNome() {
		return nome;
	}
}


