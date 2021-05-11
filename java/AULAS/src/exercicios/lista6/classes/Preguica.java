package exercicios.lista6.classes;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	
	@Override
	public void emitirSom() {
		System.out.println("Preguiça emitindo som......");
	}
	
	public void subirEmArvore() {
		System.out.println("Subindo em uma arvore......");
	}

}
