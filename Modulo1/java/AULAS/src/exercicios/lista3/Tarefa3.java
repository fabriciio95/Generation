package exercicios.lista3;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = 0;
		int totalMenos21 = 0;
		int totalMais50 = 0;
		
		while(!(idade == -99)) {
			
			System.out.print("Idade: ");
			idade = sc.nextInt();
			
			if(idade < 21 && idade > 0) {
				totalMenos21++;
			} else if(idade > 50) {
				totalMais50++;
			}
			
		}
		
		System.out.printf("Pessoas com menos de 21: %d\nPessoas com mais de 50: %d", totalMenos21, totalMais50);
		
		sc.close();

	}

}
