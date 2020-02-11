import br.ucb.l03e09.*;

public class Principal {

	public static void main(String[] args) {
		Fornecedor frncdr = new Fornecedor("will", "rua 37", "3203-2523", 2000, 300);
		System.out.println("Saldo="+frncdr.obterSaldo());
		System.out.println(frncdr.getNome());
		System.out.println(frncdr.getEndereco());
		System.out.println(frncdr.getTelefone());
		System.out.println(frncdr.getValorCredito());
		System.out.println(frncdr.getValorDivida());
		
		Empregado emp = new Empregado("joao", "rua 12", "9999-5566", 25, 2000, 10);
		System.out.println("\nSalario liquido de "+emp.getNome()+"="+emp.calcularSalario());
		
		Administrador adm = new Administrador("vitor", "rua ruy barbosa", "9229-2323", 25, 3000, 10, 500);
		System.out.println("\nSalario liquido com ajuda de custo de "+adm.getNome()+"="+adm.calcularSalario());
		
		Operario op = new Operario("maria", "rua vinte", "9122-3131", 26, 2000, 10, 500, 10);
		System.out.println("\nSalario liquido de "+op.getNome()+"="+op.calcularSalario());
		
		Vendedor vend = new Vendedor("janaina", "rua xxx", "9123-1111", 22, 1500, 10, 500, 10);
		System.out.println("\nSalario liquido de "+vend.getNome()+"="+vend.calcularSalario());
	}

}
