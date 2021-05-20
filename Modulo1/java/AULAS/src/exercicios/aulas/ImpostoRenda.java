package exercicios.aulas;

import java.util.Locale;
import java.util.Scanner;

public class ImpostoRenda {

	/*
	 * NOME DO CONTRIBUINTE 
	 * M F O 
	 * USOU  EMERGENCIAL (SIM | NAO)
	 * Salario bruto
	 * 
	 * se a soma dos salario bruto anual for acima de 60.000 = Paga IR por faixa
	 * Se nao é isento, isenta, isente
	 * 
	 * Se é isento e usou emergencial não é fraude e você tem direito a mais um emergencialr
	 * 
	 * 
	 * SALARIO DE DE 5.000 A 6.000 = 15%
	 * ACIMA DE 6000 A 10 MIL 17%
	 * acima de 10.000 - 25%
	 * 
	 * Se pegou emergencial - devolver emergencial 600 x 5
	 * 
	 * 
	 **/
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome contribuinte: ");
		String nomecontribuinte= sc.nextLine();
		
		System.out.print("Como você se identifica? [M - masculino | F - Feminino | O - Outro] ");
		char genero = sc.next().toUpperCase().charAt(0);
		
		System.out.print("Salário Bruto: ");
		double salario = sc.nextDouble();
		
		System.out.print("Usou auxilio emergencial? [1 - SIM | 2 - Não] ");
		int opcaoAuxilio = sc.nextInt();
		boolean usouAuxilio = opcaoAuxilio == 1 ? true : false;
		
		double salarioAnual = salario * 12;
		
		if(salarioAnual > 60000) {
			double impostoRenda = 0;
			if(salario >= 5000 && salario < 6000) {
				impostoRenda = salarioAnual * 0.15;
			} else if (salario >= 6000 && salario < 10000) {
				impostoRenda = salarioAnual * 0.17;
			} else {
				impostoRenda = salarioAnual * 0.25;
			}
			
			double multa = 0;
			
			if(usouAuxilio) {
				multa = 600 * 5;
			}
			
			System.out.printf("Contribuinte: %s\nMulta: %.2f\nImposto de Renda: %.2f\nDébito total: %.2f",
					nomecontribuinte, multa, impostoRenda, (impostoRenda + multa));
		} else {
			String isento = "isento";
			if(genero == 'F') {
				isento = "isenta";
			} else if(genero == 'O'){
				isento = "isente";
			}
			
			System.out.printf("Você é %s e tem direito a mais um auxilio emergencial.", isento);
		}
		
		sc.close();
		
	}
}
