package escola.entities;

public class Basico extends Estudante {
	
	private int diaAniversario;

	public Basico(String nome, int matricula, String cpf, int diaAniversario) {
		super(nome, matricula, cpf);
		this.diaAniversario = diaAniversario;
	}
	
	public Basico(String nome, int matricula, String cpf, boolean status, int diaAniversario) {
		super(nome, matricula, cpf, status);
		this.diaAniversario = diaAniversario;
	}
	
	public Basico(String nome, int matricula, String cpf, boolean status) {
		super(nome, matricula, cpf, status);
	}
	
	public Basico(String nome, int matricula, String cpf, double pontos, boolean status, int diaAniversario) {
		super(nome, matricula,cpf, pontos, status);
		this.diaAniversario = diaAniversario;
	}
	
	public void bonusAniversario(int dia) {
		if(dia == diaAniversario) {
			super.adicionarNota(super.getPontos() * 0.10);
		}
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Basico [diaAniversario=");
		builder.append(diaAniversario);
		builder.append("]");
		return builder.toString();
	}
	
	
}
