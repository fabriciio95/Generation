package exercicios.lista6.classes;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	
	@Override
	public void emitirSom() {
		System.out.println("AU AU AU AU AU");
	}
	
	public void correr() {
		System.out.println("CORRENDO...");
	}
}
