package exemplos;

public class Fatorial {

	public static void main(String[] args) {
		
		int fatorial = 1;
		for (int i = 1; i <= 6; i++) {
			fatorial *= i;
		}
		
		System.out.println(fatorial);
		System.out.println(fatorial(6));
		
	}
	
	
	public static int fatorial(int n) {
		if(n == 0) {
			return 1;
		}
		
		return n * fatorial(n - 1);
	}
}
