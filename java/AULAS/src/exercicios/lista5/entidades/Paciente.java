package exercicios.lista5.entidades;

public class Paciente {

	public int id;
	public String nome;
	public String rg;
	public int idade;
	public String diagnostico;
	
	public void exibirDadosPaciente() {
		System.out.printf("\nC�digo: %d\nNome: %s\nRG: %s\nIdade: %d\nDiagn�stico: %s", id, nome, rg, idade, diagnostico);
	}
}
