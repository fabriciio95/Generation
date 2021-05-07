package exercicios.lista4;

import java.util.Random;
import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[][] matriz1 = new double[2][2];
		double[][] matriz2 = new double[2][2];
		double[][] matrizSoma = new double[2][2];
		double[][] matrizSubtracao = new double[2][2];
		
		for(int linha = 0; linha < matriz1.length; linha++) {
			for(int coluna = 0; coluna < matriz1[linha].length; coluna++) {
				Random random = new Random();
				matriz1[linha][coluna] = random.nextInt(9);
				matriz2[linha][coluna] = random.nextInt(9);
			}
		}
		
		char opcaoSaida = 'S';
		while(opcaoSaida != 'N') {
			System.out.println("(1) Somar\n(2) Subtrair\n(3) Adicionar valor\n(4) Imprimir");
			int opcaoMenu = sc.nextInt();
			
			if(opcaoMenu == 1) {
				System.out.println("==== MATRIZ SOMA ====");
				for(int linha = 0; linha < matriz1.length; linha++) {
					for(int coluna = 0; coluna < matriz1[linha].length; coluna++) {
						matrizSoma[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
						System.out.printf("%.1f ", matrizSoma[linha][coluna]);
					}
					System.out.println();
				}
				System.out.println();
			} else if(opcaoMenu == 2) {
				System.out.println("==== MATRIZ SUBTRAÇÃO ====");
				for(int linha = 0; linha < matriz1.length; linha++) {
					for(int coluna = 0; coluna < matriz1[linha].length; coluna++) {
						matrizSubtracao[linha][coluna] = matriz1[linha][coluna] - matriz2[linha][coluna];
						System.out.printf("%.1f ", matrizSubtracao[linha][coluna]);
					}
					System.out.println();
				}
				System.out.println();
			} else if(opcaoMenu == 3) {
				System.out.println("Qual valor deseja adicionar? ");
				double valor = sc.nextDouble();
				matriz1[1][1] = valor;
				matriz2[1][1] = valor;
			}  else if(opcaoMenu == 4) {
				System.out.println("==== MATRIZ 1 ====");
				boolean imprimeMatriz1 = true;
				for(int linha = 0; linha < matriz1.length; linha++) {
					for(int coluna = 0; coluna < matriz1[linha].length; coluna++) {
						if(imprimeMatriz1) {
							System.out.printf("%.1f ", matriz1[linha][coluna]);
						} else {
							System.out.printf("%.1f ", matriz2[linha][coluna]);
						}
					}
					System.out.println();
					if(linha == (matriz1.length - 1) && imprimeMatriz1) {
						linha = -1;
						System.out.println("\n==== MATRIZ 2 ====");
						imprimeMatriz1 = false;
					}
				}
				
				System.out.println();
			}
			
			
			System.out.print("Deseja continuar? [S - SIM | N - NÃO] ");
			opcaoSaida = sc.next().toUpperCase().charAt(0);
			System.out.println();
		}
		
		sc.close();
	}
	
	
	public static void imprimirMatriz(double matriz[][]) {
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.printf("%.1f ", matriz[linha][coluna]);
			}
			System.out.println();
		}
	}
}
