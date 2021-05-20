package exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exemplos.entidades.Funcionario;
import exemplos.entidades.Terceiro;

public class ProgramaFuncionario {

	public static void main(String[]args)
	{
		Scanner leia = new Scanner(System.in);
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		System.out.println("CADASTRO DE FUNCION�RIOS");
		System.out.print("Quantidade de funcion�rios: ");
		int qtdFuncionarios = leia.nextInt();
		
		for(int i = 1; i <= qtdFuncionarios; i++) {
			System.out.print("Tipo de funcion�rio: [1- Funcion�rio | 2 - Funcion�rio Tercerizado] ");
			char opcao = leia.next().toUpperCase().charAt(0);
			System.out.print("Matricula: ");
			String matricula = leia.next();
			
			System.out.print("Nome: ");
			leia.nextLine();
			String nome = leia.nextLine();
			
			System.out.print("Horas trabalhadas: ");
			int horasTrabalhadas = leia.nextInt();
			
			System.out.print("Sal�rio por hora: ");
			double salarioHora = leia.nextDouble();
			
			if(opcao == '2') {
				System.out.print("Qual valor de adicional? ");
				double adicional = leia.nextDouble();
				funcionarios.add(new Terceiro(matricula, nome, horasTrabalhadas, salarioHora,
						adicional));
			} else {
				funcionarios.add(new Funcionario(matricula, nome, horasTrabalhadas, salarioHora));
			}
		}
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
			funcionario.mostrarSalario();
		}	
		
		leia.close();
	}
}
