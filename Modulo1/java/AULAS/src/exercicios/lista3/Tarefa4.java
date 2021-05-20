package exercicios.lista3;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0, pessoasNervosasComMais40 = 0,
		pessoasCalmasComMenos18 = 0, contador = 0;
		
		while(contador < 3) {
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Sexo: [1-Feminino | 2-Masculino | 3- Outros] ");
			int sexo = sc.nextInt();
			
			System.out.print("Como se considera? [1-Calmo | 2-Nervosa | 3-Agressiva] ");
			int caracteristica = sc.nextInt();
			System.out.println();
			
			if(caracteristica == 1) {
				pessoasCalmas++;
			}
			
		    if(caracteristica == 2 && sexo == 1) {
				mulheresNervosas++;
			}
			
			if(caracteristica == 3 && sexo == 2) {
				homensAgressivos++;
			}
			
			if(caracteristica == 1 && sexo == 3) {
				outrosCalmos++;
			}
			
			if(caracteristica == 2 && idade > 40) {
				pessoasNervosasComMais40++;
			}
			
			if(caracteristica == 1 && idade < 18) {
				pessoasCalmasComMenos18++;
			}
			
			contador += 1;
			
		}
		
		System.out.println("Pessoas calmas: " + pessoasCalmas);
		System.out.println("Mulheres nervosas: " + mulheresNervosas);
		System.out.println("Homens agressivos: " + homensAgressivos);
		System.out.println("Outros calmos: " + outrosCalmos);
		System.out.println("Pessoas nervosas com mais de 40 anos: " + pessoasNervosasComMais40);
		System.out.println("Pessoas calmas com menos de 18 anos: " + pessoasCalmasComMenos18);
		
		sc.close();
		
	}

}
