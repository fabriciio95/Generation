package exercicios.lista5.entidades;

public class ProdutoEletronico {

	public int id;
	public String numeracao;
	public String voltagem;
	public String modelo;
	
	public void exibirDadosProduto() {
		System.out.printf("\nC�digo: %d\nNumera��o: %s\nVoltagem: %s\nModelo: %s\n", id, numeracao, voltagem, modelo);
	}
	
}
