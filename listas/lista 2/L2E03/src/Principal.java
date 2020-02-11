import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int continuar = 0;
		Pessoa pessoas[] = new Pessoa[10];
		int qtdPessoas;
		
		System.out.println("Quantas pessoas você quer inserir?");
		qtdPessoas = teclado.nextInt();
		do {
			for (int i = 0; i < qtdPessoas; i++) {
				pessoas[i] = new Pessoa();
				
				System.out.print("Nome: ");
				String nome = teclado.next();
				pessoas[i].setNome(nome);
				System.out.print("Pai: ");
				String pai = teclado.next();
				pessoas[i].setPai(pai);
				System.out.print("Mãe: ");
				String mae = teclado.next();
				pessoas[i].setMae(mae);
				System.out.print("Idade: ");
				int idade = teclado.nextInt();
				pessoas[i].setIdade(idade);
				System.out.print("\n");				
			}
			System.out.println("\nTecle 1 para refazer ou qualquer outra tecla para mostrar os dados");
			continuar = teclado.nextInt();
		}while(continuar==1);
		
		for (int i = 0; i < qtdPessoas; i++) {
			System.out.println("Nome: "+ pessoas[i].getNome());
			System.out.println("Nome do pai: "+ pessoas[i].getPai());
			System.out.println("Nome da mãe: "+ pessoas[i].getMae());
			System.out.println("Idade: "+ pessoas[i].getIdade());
			System.out.println("\n");
		}
	}
}
