package exercicios.lista4;

public class Tarefa1 {

	public static void main(String[] args) {
		
		int[] a = {1, 0, 5, -2,-5, 7};
		a[4] = 100;
		int soma = a[0] + a[1] + a[5];
		
		for(int numero : a) {
			System.out.println(numero);
		}
		
		System.out.println("Soma: " + soma);
		
	}
}
