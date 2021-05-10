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
		cliente.setId(1);
		cliente.setNome("Rodrigo Torres");
		cliente.setCpf("382.239.293-23");
		cliente.setIdade(55);
		System.out.println("==== EXERCÍCIO 1 - CLIENTE ====");
		cliente.exibirDadosCliente();
		
		Aviao aviao = new Aviao();
		aviao.setId(1);
		aviao.setFabricante("DEASER");
		aviao.setNumeroModelo("777-31H");
		aviao.setAssentos(186);
		System.out.println("\n==== EXERCÍCIO 2 - AVIÃO ====");
		aviao.exibirDadosAviao();
		aviao.decolar();
		aviao.pousar();
		
		
		ProdutoEletronico produtoEletronico = new ProdutoEletronico();
		produtoEletronico.id = 1;
		produtoEletronico.numeracao = "182293230";
		produtoEletronico.voltagem = "110v";
		produtoEletronico.modelo = "Impressora";
		System.out.println("\n==== EXERCÍCIO 3 - PRODUTO ELETRÔNICO ====");
		produtoEletronico.exibirDadosProduto();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setId(1);
		funcionario.setNome("Milton Silva");
		funcionario.setCpf("283-234-234-33");
		funcionario.setSalario(4500);
		System.out.println("\n==== EXERCÍCIO 4 - FUNCIONÁRIO ====");
		funcionario.exibirDadosFuncionario();
		
		Patinete patinete = new Patinete();
		patinete.setId(1);
		patinete.setTamanho("PEQUENO");
		patinete.setRodas(3);
		patinete.setCesta(true);
		patinete.setCor("PRETO");
		System.out.println("\n==== EXERCÍCIO 5 - PATINETE ====");
		patinete.exibirDadosPatinete();
		
		ContaBancaria conta = new ContaBancaria();
		conta.setId(1);
		conta.ativarConta();
		conta.setNumero("14434/2");
		conta.setTipo("POUPANÇA");;
		conta.setTitular("RODOLFO CAETANO");;
		conta.depositar(345.33);
		conta.sacar(100);
		System.out.println("\n==== EXERCÍCIO 6 - CONTA BANCÁRIA ====");
		conta.exibirDadosContaBancaria();
		
		
		Paciente paciente = new Paciente();
		paciente.setId(1);
		paciente.setNome("Mayara Freire");;
		paciente.setRg("33.343.349-9");;
		paciente.setIdade(34);
		paciente.setDiagnostico("RESFRIADO");
		System.out.println("\n==== EXERCÍCIO 7 - PACIENTE ====");
		paciente.exibirDadosPaciente();
		

	}

}
