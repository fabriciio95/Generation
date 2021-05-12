package escola.entities;

import java.util.Scanner;

import escola.services.EstudanteService;
import escola.utils.UI;

public class Pos extends Estudante {
	
	private double credito;

	public Pos(String nome, int matricula, String cpf, boolean status) {
		super(nome, matricula, cpf, status);
		credito = 5;
	}

	public void movimento() {
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			EstudanteService.movimento(this, super.getPontos(), i);
			char respostaContinuar = ' ';
			if (i < 9) {
				System.out.print("\nDeseja continuar? [S|N] ");
				respostaContinuar = leia.next().toUpperCase().charAt(0);
			}

			if (i == 9 || respostaContinuar == 'N') {
				pedirCreditoPos();
				UI.exibirDadosEstudante(super.getMatricula(), super.getCpf(), super.isStatus());
				System.out.printf("Nota Final: %.1f ", super.getPontos());
				break;
			}
		}
		leia.close();
	}
	
	@Override
	public void tirarNota(double nota) {
		if((super.getPontos() - nota)>= 0) {
			super.tirarNota(nota);
		}  else {
			System.out.println("Impossível realizar operação, pois a nota não pode ficar negativada!");
		}
	}
	
	public void pedirCreditoPos() {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		System.out.print("\nDeseja utilizar o bônus? [S|N] ");
		char respostaBonus = leia.next().toUpperCase().charAt(0);

		if (respostaBonus == 'S') {
			System.out.print("Qual valor que deseja usar do bônus? [Máximo 5] ");
			double bonus = leia.nextDouble();

			if (bonus <= 5 && bonus >= 0) {
				credito -= bonus;
				super.adicionarNota(bonus);
			} else {
				System.out.println("\nVocê perdeu o bônus pois digitou um valor inválido!");
			}
		}
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
}
