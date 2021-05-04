package exercicios.aulas;

import java.util.Locale;
import java.util.Scanner;

public class Conversao {

	/*
	 * sala par - celcius para farehheit
		grupo  impar - farenheit para celcius
	nome do usu�rio: _
	temperatura :
	mostra: oi xxxx, a temperatura em xxxx � F/C

	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do usu�rio: ");
		String nomeUsuario = sc.next();
		
		System.out.print("Temperatura Em Celsius: ");
		double temperaturaEmCelsius = sc.nextDouble();
		
		//�F = �C � 1, 8 + 32
				
		double farenheit = (temperaturaEmCelsius * 1.8) + 32;
		
		System.out.printf("Nome: %s\nFarenheit: %.2f�", nomeUsuario, farenheit);
		
		sc.close();

		
		
	}
}
