package exemplos;

import exemplos.entidades.Funcionario;
import exemplos.entidades.Terceiro;

public class ProgramaFuncionario {

	public static void main(String[]args)
	{
		Funcionario funcionario1 = new Funcionario("123456798", "JUVENAL" , 50, 20);
		Funcionario terceiro1 = new Terceiro("213654","Abracadabra",50,20,10);
		System.out.println(funcionario1);
		funcionario1.mostrarSalario();
		System.out.println(terceiro1);
		terceiro1.mostrarSalario();
		
	}
}
