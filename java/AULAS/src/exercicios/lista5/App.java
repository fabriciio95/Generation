package exercicios.lista5;

import exercicios.lista5.entidades.Aviao;
import exercicios.lista5.entidades.Cliente;
import exercicios.lista5.entidades.ContaBancaria;
import exercicios.lista5.entidades.Funcionario;
import exercicios.lista5.entidades.Paciente;
import exercicios.lista5.entidades.Patinete;
import exercicios.lista5.entidades.ProdutoEletronico;

public class App {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.id = 1;
		cliente.nome = "Rodrigo Torres";
		cliente.cpf = "382.239.293-23";
		cliente.idade = 55;
		System.out.println("==== EXERCÍCIO 1 - CLIENTE ====");
		cliente.exibirDadosCliente();
		
		Aviao aviao = new Aviao();
		aviao.id = 1;
		aviao.fabricante = "DEASER";
		aviao.numeroModelo = "777-31H";
		aviao.assentos = 186;
		System.out.println("\n==== EXERCÍCIO 2 - AVIÃO ====");
		aviao.exibirDadosAviao();
		
		
		ProdutoEletronico produtoEletronico = new ProdutoEletronico();
		produtoEletronico.id = 1;
		produtoEletronico.numeracao = "182293230";
		produtoEletronico.voltagem = "110v";
		produtoEletronico.modelo = "Impressora";
		System.out.println("\n==== EXERCÍCIO 3 - PRODUTO ELETRÔNICO ====");
		produtoEletronico.exibirDadosProduto();
		
		Funcionario funcionario = new Funcionario();
		funcionario.id = 1;
		funcionario.nome = "Milton Silva";
		funcionario.cpf = "283-234-234-33";
		funcionario.salario = 4500;
		System.out.println("\n==== EXERCÍCIO 4 - FUNCIONÁRIO ====");
		funcionario.exibirDadosFuncionario();
		
		Patinete patinete = new Patinete();
		patinete.id = 1;
		patinete.tamanho = "PEQUENO";
		patinete.rodas = 3;
		patinete.cesta = true;
		patinete.cor = "PRETO";
		System.out.println("\n==== EXERCÍCIO 5 - PATINETE ====");
		patinete.exibirDadosPatinete();
		
		ContaBancaria conta = new ContaBancaria();
		conta.id = 1;
		conta.ativa = true;
		conta.numero = "14434/2";
		conta.tipo = "POUPANÇA";
		conta.titular = "RODOLFO CAETANO";
		conta.saldo = 345.33;
		System.out.println("\n==== EXERCÍCIO 6 - CONTA BANCÁRIA ====");
		conta.exibirDadosContaBancaria();
		
		
		Paciente paciente = new Paciente();
		paciente.id = 1;
		paciente.nome = "Mayara Freire";
		paciente.rg = "33.343.349-9";
		paciente.idade = 34;
		paciente.diagnostico = "RESFRIADO";
		System.out.println("\n==== EXERCÍCIO 7 - PACIENTE ====");
		paciente.exibirDadosPaciente();
		

	}

}
