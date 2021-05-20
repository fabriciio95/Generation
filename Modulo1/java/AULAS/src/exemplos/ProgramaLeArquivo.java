package exemplos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramaLeArquivo {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\FabricioMacedo\\Desktop\\lista.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch(IOException erro) {
			System.out.println("Não existe este arquivo");
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
}
