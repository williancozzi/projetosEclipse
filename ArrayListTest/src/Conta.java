
public class Conta {
	protected int saldo;
	
	public Conta() {
		
	}
	
	public Conta(int saldo) {
		this.saldo = saldo;
	}

	int getSaldo() {
		return saldo;
	}

	public String toString() {
		return "Conta [saldo=" + saldo + "]";
	}
	
	
	
	
}
