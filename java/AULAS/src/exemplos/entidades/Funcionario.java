package exemplos.entidades;

public class Funcionario {

	private String matricula;
	private String nome;
	private int horasTrabalhadas;
	private double salarioHora;

	public Funcionario(String matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	public Funcionario(String matricula, String nome, int horasTrabalhadas, double salarioHora) {
		this.matricula = matricula;
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.salarioHora = salarioHora;
	}

	public void mostrarSalario() {

		System.out.printf("O seu salario é: %.2f", horasTrabalhadas * salarioHora);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	
	@Override
	public String toString() {
		return "\nmatricula: " + matricula + "\nnome: " + nome + "\nhorasTrabalhadas: " + horasTrabalhadas
				+ "\nsalarioHora: " + salarioHora;
	}

}
