package exercicios.lista5.entidades;

public class Funcionario {

	public int id;
	public String nome;
	public String cpf;
	public double salario;
	
	public void exibirDadosFuncionario() {
		System.out.printf("\nC�digo: %d\nNome: %s\nCPF: %s\nSalario: %.2f\n", id, nome, cpf, salario);
	}
}
