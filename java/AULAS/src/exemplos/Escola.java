package exemplos;

import java.util.Scanner;

public class Escola {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Dream Team G1");
		System.out.println("Seu futuro como prioridade");
		
		System.out.println("\nENSINO PÓS");
		
		System.out.print("\nMatricula: ");
		String matricula = leia.next();
		
		System.out.print("CPF: ");
		String cpf = leia.next();
		
		System.out.print("Status: [1-Ativo | 2- Inativo] ");
		String status = leia.nextInt() == 1 ? "Ativo" : "Inativo";
		
		double somaNotas = 0;
		for(int i = 0; i < 10; i++) {
			System.out.printf("\nNota Atual: %.1f\n", somaNotas);
			System.out.printf("Movimento: %d\n", (i+1));
			System.out.print("MOVIMENTO - I-inclusão de nota ou R-retirada nota: ");
			char movimento = leia.next().toUpperCase().charAt(0);
			System.out.print("Valor movimento: ");
			double valorMovimento = leia.nextDouble();
			
			double notas[] = new double[10];
			if(movimento == 'I') {
				notas[i] = valorMovimento;
				somaNotas += valorMovimento;
			} else if(movimento == 'R') {
				if((somaNotas - valorMovimento) >= 0) {
					notas[i] = -valorMovimento;
					somaNotas -= valorMovimento;
				} else { 
					System.out.println("\nValor inválido! A nota não pode ficar negativada!");
				}
			} else {
				System.out.println("\nResposta inválida! Movimentos possíveis são inclusão ou retirada! ");
				i--;
			}
			
			
			char respostaContinuar = ' ';
			if(i < 9) {
				System.out.print("\nDeseja continuar? [S|N] ");
				respostaContinuar = leia.next().toUpperCase().charAt(0);
			}
			
			
			if(i == 9 || respostaContinuar == 'N') {
				System.out.print("\nDeseja utilizar o bônus? [S|N] ");
				char respostaBonus = leia.next().toUpperCase().charAt(0);
				
				if(respostaBonus == 'S') {
					System.out.print("Qual valor que deseja usar do bônus? [Máximo 5] ");
					double bonus = leia.nextDouble();
					
					if(bonus <= 5 && bonus > 0) {
						somaNotas += bonus;
						notas[i] += bonus; 
					} else {
						System.out.println("\nVocê perdeu o bônus pois digitou um valor inválido!");
					}
				}
				
				System.out.printf("\nMatricula: %s\nCPF: %s\nStatus: %s\n", matricula, cpf, status);
				System.out.printf("Nota Final: %.1f ", somaNotas);
				break;
			}
			
		}
		leia.close();
		
	}

	
}
