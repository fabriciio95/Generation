package exemplos;

import java.util.Scanner;

public class Times {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String times[] = { "SPFC", "PALMEIRAS", "SANTOS", "CORINTHIANS" };
		int pontos[] = new int[4];
		char resposta = ' ';

		for (int rodada = 1; rodada <= 4; rodada++) {
			System.out.printf("==== RODADA %d ====\n", rodada);
			for (int time = 0; time < times.length; time++) {
				System.out.printf("%s ganhou? [g - ganhou | e - empatou | p - perdeu] ", times[time]);
				resposta = leia.next().toUpperCase().charAt(0);
				if (resposta == 'G') {
					pontos[time] += 3;
				} else if (resposta == 'E') {
					pontos[time] += 1;
				}
			}
		}

		System.out.println();
		for (int i = 0; i < times.length; i++) {
			System.out.printf("%s - %d\n", times[i], pontos[i]);
		}

		leia.close();
	}

}

;