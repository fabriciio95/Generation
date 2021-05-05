package exercicios.lista2;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1º Número: ");
		int numero1 = sc.nextInt();
		
		System.out.print("2º Número: ");
		int numero2 = sc.nextInt();
		
		System.out.print("3º Número: ");
		int numero3 = sc.nextInt();
		
		int maior = 0;
		
		
		if(numero3 >= numero2 && numero3 >= numero1) {
			maior = numero3;
		} else if(numero2 >= numero3 && numero2 >= numero1) {
			maior = numero2;
		} else {
			maior = numero1;
		}
		
		System.out.printf("O maior número é: %d", maior);
		sc.close();
	}
}
