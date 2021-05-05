package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N�mero: ");
		int numero = sc.nextInt();
		
		if (numero == 0) {
			System.out.println("O 0 � neutro.");
		} else if(numero < 0) {
			System.out.printf("O %d � negativo", numero);
		} else if(numero % 2 == 0) {
			System.out.printf("O %d � par.", numero);
		} else { 
			System.out.printf("O %d � �mpar.", numero);
		}
		
		sc.close();
		
	}
}
