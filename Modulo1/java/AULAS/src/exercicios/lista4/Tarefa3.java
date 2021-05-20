package exercicios.lista4;

import java.util.Random;

public class Tarefa3 {

	public static void main(String[] args) {
		
		int matriz[][] = new int[3][3];
		int soma = 0;
		int qtdMaiores10 = 0;
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
				Random random = new Random();
				matriz[linha][coluna] = random.nextInt(100);
				String espaco = " ";
				if(matriz[linha][coluna] > 10) {
					qtdMaiores10++;
					espaco = "  ";
				}
				soma += matriz[linha][coluna];
				
				System.out.printf("%d%s", matriz[linha][coluna], espaco);
			}
			System.out.println();
		}
		
		System.out.printf("Quantidade números maiores que 10: %d\nSoma: %d", qtdMaiores10, soma);
		
	}
}
