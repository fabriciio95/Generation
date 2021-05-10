package exercicios.lista5.entidades;

public class ProdutoEletronico {

	public int id;
	public String numeracao;
	public String voltagem;
	public String modelo;
	
	public void exibirDadosProduto() {
		System.out.printf("\nCódigo: %d\nNumeração: %s\nVoltagem: %s\nModelo: %s\n", id, numeracao, voltagem, modelo);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(String numeracao) {
		this.numeracao = numeracao;
	}

	public String getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
