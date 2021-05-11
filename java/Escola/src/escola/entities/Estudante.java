package escola.entities;

public abstract class Estudante {

	private int matricula;
	private String nome;
	private String cpf;
	private double pontos;
	private boolean status;
	
	public Estudante(String nome, int matricula, String cpf) {
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
	}
	
	public Estudante(String nome, int matricula, String cpf, boolean status) {
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
		this.status = status;
	}
	
	public Estudante(String nome, int matricula, String cpf, double pontos, boolean status) {
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
		this.status = status;
		this.pontos = pontos;
	}

	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}

	public double getPontos() {
		return pontos;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	public void adicionarNota(double nota) {
		pontos += nota;
	}
	
	public void tirarNota(double nota) {
		pontos -= nota;
	}
}
