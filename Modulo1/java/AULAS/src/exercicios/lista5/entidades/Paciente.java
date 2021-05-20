package exercicios.lista5.entidades;

public class Paciente {

	private int id;
	private String nome;
	private String rg;
	private int idade;
	private String diagnostico;
	
	public void exibirDadosPaciente() {
		System.out.printf("\nC�digo: %d\nNome: %s\nRG: %s\nIdade: %d\nDiagn�stico: %s", id, nome, rg, idade, diagnostico);
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
}
