package exercicios.lista5.entidades;

public class Cliente {

	private int id;
	private String nome;
	private String cpf;
	private int idade;
	
	public void exibirDadosCliente() {
		System.out.printf("\nCódigo: %d\nNome: %s\nCPF: %s\nIdade: %d\n", id, nome, cpf, idade);
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
