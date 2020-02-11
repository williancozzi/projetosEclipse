import br.ucb.l03e04.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opcaoIngresso;
		int escolhaCamarote;
		int continuar = 0;
		
		Scanner teclado = new Scanner(System.in);
		Ingresso ingresso = new Ingresso(5);
		
			do {
			System.out.println("Selecione: \n1-Ingresso normal\n2-Vip\n");
			opcaoIngresso = teclado.nextInt();
			
			if (opcaoIngresso==1) {
				Normal ingressoNormal = new Normal(5);
				ingresso = ingressoNormal;
				System.out.println(ingressoNormal.imprimirValor());
				System.out.println(ingressoNormal.toString());
			} else if (opcaoIngresso==2) {
				System.out.println("Selecione: \n1-Camarote inferior\n2-Camarote superior\n");
				escolhaCamarote = teclado.nextInt();	
				if (escolhaCamarote==1) {
					Vip ingressoVip = new Vip(10,5);
					CamaroteInferior camaroteInf = new CamaroteInferior("Camarote Inferior", 10, 5);
					ingresso = camaroteInf;
					System.out.println(camaroteInf.mostraLocalizacao());
					System.out.println(camaroteInf.mostrarValorVip());
				} else if (escolhaCamarote==2) {
					Vip ingressoVip = new Vip(10,5);
					CamaroteSuperior camaroteSup = new CamaroteSuperior("Camarote Superior", 10, 5);
					ingresso = camaroteSup;
					System.out.println(camaroteSup.mostraLocalizacao());
					System.out.println(camaroteSup.mostrarValorVip());
			} else {
				System.out.println("erro");
			}
		}
			System.out.println("\nAperte 1 para continuar ou qualquer outra numero para sair");
			continuar = teclado.nextInt();
			System.out.println();
		}while(continuar == 1);
	}
}
