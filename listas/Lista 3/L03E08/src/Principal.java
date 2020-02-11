import br.ucb.l03e08.*;

public class Principal {
	public static void main(String[] args){
		Empregado e = new Empregado("adin", 23, "m", 9999, "uc99");
		System.out.println("INSS ---> "+ e.valorInss(e.getSalario()));
		
		System.out.println("");
		
		Cliente c = new Cliente("carols", 77, "f", 50, 1999);
		System.out.println(c.toString());
		
		System.out.println("");
		
		Gerente g = new Gerente("anao", 55, "maxo", 100, "uc1810", "Setor");
		System.out.println(g.toString());
		
		
		System.out.println("");
		
		Vendedor v = new Vendedor("duba", 34, "male", 5000, "uc181", 330, 20);
		System.out.println(v.toString());
		
		
		
	}
}
