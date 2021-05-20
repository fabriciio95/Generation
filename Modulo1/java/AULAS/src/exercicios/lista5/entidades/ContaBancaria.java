package exercicios.lista5.entidades;

public class ContaBancaria {

	private int id;
	private String numero;
	private String titular;
	private boolean ativa;
	private String tipo;
	private double saldo;
	
	public ContaBancaria() {
		this.saldo = 0.0;
	}
	
	public void exibirDadosContaBancaria() {
		System.out.printf("\nCódigo: %d\nNumero: %s\nAtiva: %s\nTipo: %s\nSaldo: R$%.2f\nTitular: %s\n", id, numero,
				ativa ? "SIM" : "NÃO", tipo, saldo, titular);
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public void desativarConta() {
		this.ativa = false;
	}
	
	public void ativarConta() {
		this.ativa = true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

}
