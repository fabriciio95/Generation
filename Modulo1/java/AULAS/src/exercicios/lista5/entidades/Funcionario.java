package exercicios.lista5.entidades;

public class Funcionario {

	private int id;
	private String nome;
	private String cpf;
	private double salario;
	
	public void exibirDadosFuncionario() {
		System.out.printf("\nC�digo: %d\nNome: %s\nCPF: %s\nSalario: %.2f\n", id, nome, cpf, salario);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
