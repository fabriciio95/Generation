package exemplos;

import java.util.Scanner;

public class MaiorPontuacaoVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pontos[] = new int[5];
		int maiorPontuacao = 0;
		
		for(int i = 0; i < pontos.length; i++) {
			System.out.print("Pontuaçao: ");
			pontos[i] = sc.nextInt();
			
			if(pontos[i] > maiorPontuacao) {
				maiorPontuacao = pontos[i];
			}
		}
		
		System.out.printf("Maior pontuação: %d", maiorPontuacao);
		
		sc.close();
	}
}
