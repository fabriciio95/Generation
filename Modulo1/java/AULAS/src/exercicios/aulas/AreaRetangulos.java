package exercicios.aulas;

import java.util.Scanner;

public class AreaRetangulos {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double area1=0;
		double area2=0;
		double base1=0;
		double base2=0;
		double altura1=0;
		double altura2=0;
		
		System.out.println("Digite a base do retângulo 1:");
		base1= leia.nextDouble();
		System.out.println("Digite a base do retângulo 2:");
		base2= leia.nextDouble();
		System.out.println("Digite a altura do retângulo 1:");
		altura1= leia.nextDouble();
		System.out.println("Digite a altura do retângulo 2:");
		altura2= leia.nextDouble();
		
		area1=base1*altura1;
		area2=base2*altura2;
		
		if(area1==area2) {
			System.out.println("As áreas são iguais");
		}
		else if(area1>area2) {
			System.out.println("A área 1 é maior que a 2.");
		}
		else {
			System.out.println("A área 2 é maior que a 1.");
		}
		
		leia.close();
		
	}

}

