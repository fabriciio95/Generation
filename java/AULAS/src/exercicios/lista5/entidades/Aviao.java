package exercicios.lista5.entidades;

public class Aviao {

	public int id;
	public String fabricante;
	public String numeroModelo;
	public int assentos;
	
	
	public void exibirDadosAviao() {
		System.out.printf("\nC�digo: %d\nFabricante: %s\nN�mero do Modelo: %s\nAssentos: %d\n", id, fabricante, numeroModelo, assentos);
	}
	
	
}
