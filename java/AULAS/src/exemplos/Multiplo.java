package exemplos;

public class Multiplo {

	public static void main(String[] args) {
		for(int i = 3; i < 33; i += 3) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 1; i < 33; i++) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
	
