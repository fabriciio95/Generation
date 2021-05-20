package exercicios.lista2;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N�mero: ");
		double numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.printf("O n�mero %.0f � par e sua raiz quadrada � %.2f", numero, Math.sqrt(numero));
		} else {
			System.out.printf("O n�mero %.0f � �mpar e elevado ao quadrado � %.0f", numero, Math.pow(numero, 2));
		}
		
		sc.close();
	}
}
