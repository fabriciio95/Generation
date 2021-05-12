package exercicios.lista6.programa;

import exercicios.lista6.classes.Cachorro;
import exercicios.lista6.classes.Cavalo;
import exercicios.lista6.classes.Preguica;
import exercicios.lista6.interfaces.InterfaceAnimal;

public class Programa {

	public static void main(String[] args) {
		InterfaceAnimal cachorro = new Cachorro("Cachorro",  4);
		InterfaceAnimal cavalo = new Cavalo("Cavalo", 5);
		InterfaceAnimal preguica = new Preguica("Pregui�a",  3);
		
		System.out.println("=== CACHORRO ====");
		System.out.println(cachorro);
		cachorro.emitirSom();
		cachorro.movimento();
		
		System.out.println("=== CAVALO ===");
		System.out.println(cavalo);
		cavalo.emitirSom();
		cavalo.movimento();
		
		System.out.println("=== PREGUI�A ====");
		System.out.println(preguica);
		preguica.emitirSom();
		preguica.movimento();
		

	}

}
