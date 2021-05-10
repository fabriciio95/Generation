package exercicios.lista5.entidades;

public class Aviao {

	public int id;
	public String fabricante;
	public String numeroModelo;
	public int assentos;
	
	
	public void exibirDadosAviao() {
		System.out.printf("\nCódigo: %d\nFabricante: %s\nNúmero do Modelo: %s\nAssentos: %d\n", id, fabricante, numeroModelo, assentos);
	}
	
	
}
