import java.util.Scanner;

import br.ucb.teste.Aluno;
import br.ucb.teste.Escola;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		Escola escola = new Escola();
		Aluno aluno1 = new Aluno("joao", 3, 4, "12345");

		escola.cadastrarAluno(aluno1);
		for (int j = 0; j < args.length; j++) {
			System.out.println(escola.getAlunos().get(j).getNome());	
		} 

		/* System.out.println("Escolha a opção:\n1-Logar\n2-Cadastrar aluno\n3-Sair");
		do {
			switch(opcao) {
			case 1:
					aluno1.logar("12345");
				break;
			case 2:
				escola.cadastrarAluno(aluno1);
				break;
			case 3:
				System.exit(1);
			}
			opcao = teclado.nextInt();
		}while(opcao!=2);

		 */
	}

}
