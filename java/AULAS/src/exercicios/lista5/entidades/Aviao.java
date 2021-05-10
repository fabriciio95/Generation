package exercicios.lista5.entidades;

public class Aviao {

	private int id;
	private String fabricante;
	private String numeroModelo;
	private int assentos;
	
	
	public void exibirDadosAviao() {
		System.out.printf("\nCódigo: %d\nFabricante: %s\nNúmero do Modelo: %s\nAssentos: %d\n", id, fabricante, numeroModelo, assentos);
	}
	
	public void decolar() {
		System.out.println("Decolando...");
	}
	
	public void pousar() {
		System.out.println("Pousando...");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getNumeroModelo() {
		return numeroModelo;
	}

	public void setNumeroModelo(String numeroModelo) {
		this.numeroModelo = numeroModelo;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
}
