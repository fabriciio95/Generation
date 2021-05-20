package exemplos.poo.principal;

import java.util.Scanner;

import exemplos.poo.entidades.Retangulo;

public class RetanguloMain {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Retangulo retangulo1 = new Retangulo();
		
		System.out.print("Altura retangulo 1: ");
		retangulo1.altura = leia.nextDouble();
		
		System.out.print("Base retangulo 1: ");
		retangulo1.base = leia.nextDouble();
		
		System.out.printf("\n¡rea do retangulo 1: %.1f\n", retangulo1.getArea());
		
		Retangulo retangulo2 = new Retangulo();
		
		System.out.print("\nAltura retangulo 2: ");
		retangulo2.altura = leia.nextDouble();
		
		System.out.print("Base retangulo 2: ");
		retangulo2.base = leia.nextDouble();
		
		System.out.printf("\n¡rea do retangulo 2: %.1f\n", retangulo2.getArea());
		
		if(retangulo1.getArea() > retangulo2.getArea()) {
			System.out.printf("\n¡rea do retangulo 1 (%.1f) È maior;", retangulo1.getArea());
		} else if(retangulo2.getArea() > retangulo1.getArea()) {
			System.out.printf("\n¡rea do retangulo 2 (%.1f) È maior;", retangulo2.getArea());
		} else {
			System.out.printf("\n¡rea do retangulo 1 (%.1f) È igual a do segundo retangulo (%.1f);",
					retangulo1.getArea(), retangulo2.getArea());
		}
		
		
		leia.close();
	}

}
