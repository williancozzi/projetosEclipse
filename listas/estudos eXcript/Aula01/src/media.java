import java.util.Scanner;

public class media {
	public static void main (String args[]) {
		float n1, n2, n3, media;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		n1 = teclado.nextFloat();
		System.out.print("Digite a segunda nota: ");
		n2 = teclado.nextFloat();
		System.out.print("Digita a terceira nota: ");
		n3 = teclado.nextFloat();
		media = (n1+n2+n3)/3;
		System.out.print("A média final é de " + media);
		
	}
}
