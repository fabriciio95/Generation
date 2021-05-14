package exemplos.entidades;

public class Terceiro extends Funcionario {

	private double adicional;

	public Terceiro(String matricula, String nome, int horasTrabalhadas, double salarioPorHora, double adicional) {
		super(matricula, nome,horasTrabalhadas,salarioPorHora);
		this.adicional = adicional;
	}
	
	
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	

	@Override
	public void mostrarSalario()
	{
		System.out.printf("O seu salario é: %.2f" , (super.getHorasTrabalhadas()*  super.getSalarioHora())+adicional);
	}

	@Override
	public String toString() {
		return "\nMatricula: "+super.getMatricula()+"\nHoras Trabalhadas: "+super.getHorasTrabalhadas()+
				"\nNome: "+super.getNome()+"\nSalario hora: "+super.getSalarioHora()+"\nadicional: " + adicional;
	}
	
}
