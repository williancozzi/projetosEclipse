import java.util.Scanner;

public class AulaCalc {
	public static void main(String args[]) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Digite 1 para somar");
		System.out.println("Digite 2 para subtrair");
		System.out.println("Digite 3 para multiplicar");
		System.out.println("Digite 4 para dividir");

		int i = tec.nextInt();

		System.out.println("Digite o primero número: ");
		double n1 = tec.nextDouble();

		System.out.println("Digite o segundo número: ");
		double n2 = tec.nextDouble();

		if (i == 1) {
			System.out.println(n1 + n2);
		} else {
			if (i == 2) {
				System.out.println(n1 - n2);
			} else {
				if (i == 3) {
					System.out.println(n1 * n2);
				} else {
					if (i == 4) {
						System.out.println(n1 / n2);
					} else {
						System.out.println("Operação inválida");
					}
				}
			}

		}
	}
}
