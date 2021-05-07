package exercicios.lista4;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[6];
		int[] impares = new int[numeros.length];
		int[] pares = new int[numeros.length];
	
		int somaPares = 0;
		int qtdImpares = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print((i+1)+ "º número: ");
			numeros[i] = sc.nextInt();
			
			if(numeros[i] % 2 == 0 && numeros[i] != 0) {
				somaPares += numeros[i];
				pares[i] = numeros[i];
			} else {
				qtdImpares++;
				impares[i] = numeros[i];
			}
		}
		
		System.out.print("Pares: ");
		for(int i : pares) {
			if(i != 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();
		System.out.printf("Soma dos pares: %d\n", somaPares);
		System.out.print("Ímpares: ");
		for (int i : impares) {
			if(i != 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();
		System.out.printf("Quantidade de ímpares digitados: %d", qtdImpares);
		
		sc.close();

	}

}
