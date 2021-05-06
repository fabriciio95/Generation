package exercicios.aulas;

import java.util.Scanner;

public class ValoresLidosWhile {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero = 1;
		double somatorio = 0;
		double media = 0;
		int totalValoresLidos = 0;
	
		
		while (numero != 0) {
			System.out.print("Informe um n�mero positivo: ");
			numero = sc.nextDouble();
			
			somatorio += numero;
			
			if(numero > 0) {
				totalValoresLidos++;
			}
			
		}
		
		media = somatorio / totalValoresLidos;
		
		System.out.printf("\nA soma dos valores informados � de: %.0f\nA quantidade de vezes que foram informados n�meros diferentes"
				+ " de zero foi de: %d vezes\nA m�dia dos n�meros �: %.2f", somatorio, totalValoresLidos, media);

		sc.close();
	}
}
