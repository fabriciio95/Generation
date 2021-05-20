package exercicios.lista3;

import java.util.Scanner;

public class Tarefa2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdPar = 0;
		int qtdImpar = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("Informe o %dº número: ", i);
			int numero = sc.nextInt();
			if(numero % 2 == 0) {
				qtdPar+=1;
			} else {
				qtdImpar+=1;
			}
		}
		
		System.out.printf("Números pares: %d\nNúmeros ímpares: %d", qtdPar, qtdImpar);
		
		sc.close();
	}
}
