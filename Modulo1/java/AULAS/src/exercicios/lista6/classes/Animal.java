package exercicios.lista6.classes;

import exercicios.lista6.interfaces.InterfaceAnimal;

public abstract class Animal implements InterfaceAnimal {
	
	private String nome;
	private int idade;
	
	
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	@Override
	public void movimento() {
		System.out.println("Correndoooo.....");
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s\nIdade: %d\n", nome,idade);
	}
}
