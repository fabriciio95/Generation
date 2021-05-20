package exercicios.lista5.entidades;

public class Patinete {

	private int id;
	private String tamanho;
	private String cor;
	private int rodas;
	private boolean cesta;
	
	public void exibirDadosPatinete() {
		System.out.printf("\nCódigo: %d\nTamanho: %s\nCor: %s\nRodas: %d\nPossui cesta: %s\n",
				id, tamanho, cor, rodas, cesta ? "SIM" : "NÃO");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}

	public boolean isCesta() {
		return cesta;
	}

	public void setCesta(boolean cesta) {
		this.cesta = cesta;
	}
}
