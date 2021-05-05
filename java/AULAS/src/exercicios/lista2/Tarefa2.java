package exercicios.lista2;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1º Número: ");
		int numero1 = sc.nextInt();
		
		System.out.print("2º Número: ");
		int numero2 = sc.nextInt();
		
		System.out.print("3º Número: ");
		int numero3 = sc.nextInt();
		
		if(numero3 >= numero2 && numero2 >= numero1) {
			System.out.printf("%d %d %d", numero1, numero2, numero3);
		} else if(numero2 >= numero3 && numero3 >= numero1) {
			System.out.printf("%d %d %d", numero1, numero3, numero2);
		} else if(numero1 >= numero2 && numero2 >= numero3) {
			System.out.printf("%d %d %d", numero3, numero2, numero1);
		} else if (numero1 >= numero3 && numero3 >= numero2) {
			System.out.printf("%d %d %d", numero2, numero3, numero1);
		} else if(numero3 >= numero1 && numero1 >= numero2) {
			System.out.printf("%d %d %d", numero2, numero1, numero3);
		} else {
			System.out.printf("%d %d %d", numero3, numero1, numero2);
		}
		
		
		
		sc.close();

	}

}
