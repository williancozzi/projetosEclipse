import br.ucb.l03e05.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opcao;
		Scanner teclado = new Scanner(System.in);
		Imovel casa = new Imovel("Rua 37 sul", 300000);
		
		System.out.println("Escolha: \n1-Imóvel novo\n2-Imóvel velho");
		opcao = teclado.nextInt();
		
		if (opcao==1) {
			ImovelNovo casaNova = new ImovelNovo("Rua 37 sul", 300000, 25000);
			casa = casaNova;
			System.out.println(casaNova.toString());
		} else if (opcao==2) {
			ImovelVelho casaVelha = new ImovelVelho("Rua 12 sul", 500000, 150000);
			casa = casaVelha;
			System.out.println(casaVelha.toString());
		}else {
			System.out.println("erro");
		}

	}

}
