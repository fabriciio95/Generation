package exercicios.lista1;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("X1: ");
		double x1 = sc.nextInt();
		
		System.out.print("Y1: ");
		double y1 = sc.nextInt();
	
		System.out.print("X2: ");
		double x2 = sc.nextInt();
		
		System.out.print("Y2: ");
		double y2 = sc.nextInt();
		
		double d = Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
		
		System.out.printf("Dist�ncia: %.2f", d);
		
		
		sc.close();
	}
}
