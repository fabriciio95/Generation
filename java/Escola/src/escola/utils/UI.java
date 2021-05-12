package escola.utils;

import java.util.Scanner;

public class UI {

	public static void imprimeDadosEscola() {
		System.out.println(" -------DREAM TEAM G1------- ");
		System.out.println(" SUA EDUCAÇÃO É NOSSA PRIORIDADE!! ");
	}

	public static int opcaoMenuPrincipal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n----------------------------------------");
		System.out.println("\n1-BÁSICO\n2-MÉDIO\n3-GRADUAÇÃO\n4-PÓS\n5-MESTRADO\n6-SAIR");
		System.out.println("\nDIGITE O CÓDIGO DA OPÇÃO SELECIONADA: ");
		int opcao = sc.nextInt();
		sc.close();
		return opcao;
	}
	
	public static void exibirDadosEstudante(int matricula, String cpf, boolean status) {
		System.out.printf("\nMatricula: %s\nCPF: %s\nStatus: %s\n", matricula, cpf,
				status ? "Ativo" : "Inativo");
	}
}
