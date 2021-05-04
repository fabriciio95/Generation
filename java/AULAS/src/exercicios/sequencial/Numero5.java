package exercicios.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Numero5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Nota 2: ");
		double nota2 = sc.nextDouble();
		
		System.out.print("Nota 3: ");
		double nota3 = sc.nextDouble();
		
		double mediaPonderada = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 9;
		
		System.out.printf("Média Final: %.2f", mediaPonderada);
		
		sc.close();
	}
}
