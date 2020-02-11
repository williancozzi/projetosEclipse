import java.util.Scanner;

import br.ucb.escola.Aluno;
import br.ucb.escola.Escola;
import br.ucb.escola.Professor;
import br.ucb.escola.Usuario;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in); 
		String login, senha;
		int opcao;
		Usuario usuario;
		Escola escola = new Escola();
		do {
			System.out.print("Login: ");
			login = teclado.next();
			System.out.print("Senha: ");
			senha = teclado.next();
			usuario = escola.logar(login, senha);
			if (usuario == null)
				System.out.println("Erro de login");
			else {
				switch (usuario.getClass().getSimpleName()) {
				case "Diretor":
					do {
						System.out.println("Bem vindo Diretor");
						System.out.println("1. Cadastrar professor");
						System.out.println("2. Cadastrar aluno");
						System.out.println("0. Sair/Logoff");
						System.out.print("Escolha sua opção: ");
						opcao = teclado.nextInt();
						switch (opcao) {
						case 1:
							System.out.print("Login: ");
							login = teclado.next();
							System.out.print("Senha: ");
							senha = teclado.next();
							Professor professor = new Professor(login, senha);
							escola.cadastrar(professor, usuario);
							break;
						case 2:
							System.out.print("Login: ");
							login = teclado.next();
							System.out.print("Senha: ");
							senha = teclado.next();
							Aluno aluno = new Aluno(login, senha);
							escola.cadastrar(aluno, usuario);
							break;
						}
					} while (opcao != 0);
					break;
				case "Professor":
					System.out.println("Bem vindo Professor");
					break;
				case "Aluno":
					System.out.println("Bem vindo Aluno");
					break;
				}
			}
			System.out.print("Continuar? 1-Sim, 2-Não: ");
			opcao = teclado.nextInt();
		} while (opcao != 2);
	}

}
