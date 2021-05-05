package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número: ");
		int numero = sc.nextInt();
		
		if (numero == 0) {
			System.out.println("O 0 é neutro.");
		} else if(numero < 0) {
			System.out.printf("O %d é negativo", numero);
		} else if(numero % 2 == 0) {
			System.out.printf("O %d é par.", numero);
		} else { 
			System.out.printf("O %d é ímpar.", numero);
		}
		
		sc.close();
		
	}
}
