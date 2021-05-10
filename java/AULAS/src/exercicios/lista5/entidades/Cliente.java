package exercicios.lista5.entidades;

public class Cliente {

	public int id;
	public String nome;
	public String cpf;
	public int idade;
	
	public void exibirDadosCliente() {
		System.out.printf("\nCódigo: %d\nNome: %s\nCPF: %s\nIdade: %d\n", id, nome, cpf, idade);
	}
	
}
