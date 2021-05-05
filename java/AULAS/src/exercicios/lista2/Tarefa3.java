package exercicios.lista2;

import java.util.Scanner;

public class Tarefa3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Categoria Infantil");
		} else if(idade >= 15 && idade <= 17) {
			System.out.println("Categoria Juvenil");
		} else if(idade >= 18 && idade <= 25) {
			System.out.println("Categoria adulto");
		} else {
			System.out.println("Idade não corresponde a nenhuma categoria");
		}
		
		
		sc.close();
	}

}
