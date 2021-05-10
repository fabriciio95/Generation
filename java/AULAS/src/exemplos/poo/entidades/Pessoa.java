package exemplos.poo.entidades;

public class Pessoa {

	/*
	 * CONTATOS AMIGOS
	   CADASTRO ALUNOS
	   CADASTRO DE CLIENTES

	nome - anoNasc - genero - M | F | O - vivo - boolean
	
	criar classe chamada Pessoa 
	
	método - mostra a idade aproximada da pessoa
	
	Pedir informaçoes de uma pessoa, e exibir a idade

	 */
	
	public String nome;
	public int anoNasc;
	public char genero;
	public boolean vivo;
	
	public void calculaIdade() {
		System.out.print("Idade: " + (2021 - anoNasc));
	}
	
	
}
