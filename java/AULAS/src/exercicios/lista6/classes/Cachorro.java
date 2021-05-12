package exercicios.lista6.classes;

public class Cachorro extends Animal {
	
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	
	@Override
	public void emitirSom() {
		System.out.println("AU AU AU AU AU");
	}
}
