package exercicios.lista5.entidades;

public class ContaBancaria {

	public int id;
	public String numero;
	public String titular;
	public boolean ativa;
	public String tipo;
	public double saldo;
	
	public void exibirDadosContaBancaria() {
		System.out.printf("\nC�digo: %d\nNumero: %s\nAtiva: %s\nTipo: %s\nSaldo: R$%.2f\nTitular: %s\n", id, numero,
				ativa ? "SIM" : "N�O", tipo, saldo, titular);
	}
}
