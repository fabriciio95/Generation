package escola.services;

import java.util.Scanner;

import escola.entities.Basico;
import escola.entities.Estudante;
import escola.entities.Pos;

public class EstudanteService {

	public static Estudante obterDadosEstudante(String tipoEstudante) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nNome: ");
		String nome = leia.nextLine();
		
		System.out.print("Matricula: ");
		int matricula = leia.nextInt();
		
		System.out.print("CPF: ");
		String cpf = leia.next();
		
		System.out.print("Status: [1-Ativo | 2- Inativo] ");
		boolean status = leia.nextInt() == 1 ? true : false;
		
		if(tipoEstudante.equalsIgnoreCase("Basico") || tipoEstudante.equalsIgnoreCase("Básico")) {
			return new Basico(nome, matricula, cpf, status);
		}
		
		return new Pos(nome, matricula, cpf, status);
	}
	
	public static void movimento(Estudante estudante, double somaNotas, int indiceLaco) {
		Scanner leia = new Scanner(System.in);
		System.out.printf("\nNota Atual: %.1f\n", somaNotas);
		System.out.printf("Movimento: %d\n", (indiceLaco + 1));
		System.out.print("MOVIMENTO - I-inclusão de nota ou R-retirada nota: ");
		char movimento = leia.next().toUpperCase().charAt(0);
		System.out.print("Valor movimento: ");
		double valorMovimento = leia.nextDouble();

		if (movimento == 'I') {
			estudante.adicionarNota(valorMovimento);
		} else if (movimento == 'R') {
			estudante.tirarNota(valorMovimento);
		} else {
			System.out.println("\nResposta inválida! Movimentos possíveis são inclusão ou retirada! ");
		}
	}
}
