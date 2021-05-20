package exercicios.lista3;

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0, numero = 0;
		
		do {
			
			System.out.print("Número: ");
			numero = sc.nextInt();
			
			soma += numero;
			
		} while(numero != 0);
		
		System.out.printf("Soma: %d", soma);
		
		sc.close();
	}

}
