package exercicios.lista5.entidades;

public class Patinete {

	public int id;
	public String tamanho;
	public String cor;
	public int rodas;
	public boolean cesta;
	
	public void exibirDadosPatinete() {
		System.out.printf("\nCódigo: %d\nTamanho: %s\nCor: %s\nRodas: %d\nPossui cesta: %s\n",
				id, tamanho, cor, rodas, cesta ? "SIM" : "NÃO");
	}
}
