package exercicios.lista6.classes;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	
	@Override
	public void emitirSom() {
		System.out.println("Preguiça emitindo som......");
	}
	
	@Override
	public void movimento() {
		System.out.println("Preguiça subindo arvore.......");
	}

}
