package exercicios.lista1;

import java.util.Scanner;

public class Tarefa7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A: ");
		double a = sc.nextInt();
		
		System.out.print("B: ");
		double b = sc.nextInt();
		
		System.out.print("C: ");
		double c = sc.nextInt();
		
		System.out.print("D: ");
		double d = sc.nextInt();
		
		System.out.print("E: ");
		double e = sc.nextInt();
		
		System.out.print("F: ");
		double f = sc.nextInt();
		
		double x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		
		double y = ((a * f) - (c * d)) / ((a * e) - (b * d));
		
		System.out.printf("X: %.2f\nY: %.2f", x, y);
		
		
		sc.close();
	}

}
