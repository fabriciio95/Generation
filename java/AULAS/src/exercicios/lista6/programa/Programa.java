package exercicios.lista6.programa;

import exercicios.lista6.classes.Animal;
import exercicios.lista6.classes.Cachorro;
import exercicios.lista6.classes.Cavalo;
import exercicios.lista6.classes.Preguica;

public class Programa {

	public static void main(String[] args) {
		Animal cachorro = new Cachorro("Cachorro",  4);
		Animal cavalo = new Cavalo("Cavalo", 5);
		Animal preguica = new Preguica("Preguiça",  3);
		
		System.out.println("=== CACHORRO ====");
		System.out.println(cachorro);
		cachorro.emitirSom();
		cachorro.movimento();
		
		System.out.println("=== CAVALO ===");
		System.out.println(cavalo);
		cavalo.emitirSom();
		cavalo.movimento();
		
		System.out.println("=== PREGUIÇA ====");
		System.out.println(preguica);
		preguica.emitirSom();
		preguica.movimento();

	}

}
