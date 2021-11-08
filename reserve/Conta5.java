package reserve;

public class Conta5 {

	private int numeroConta;
	private String nome;
	private double saldo;
	

public Conta5(int numeroConta, String nome) {
	this.numeroConta = numeroConta;
	this.nome = nome;
	
}
	public Conta5(int numeroConta, String nome, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		depositoConta(depositoInicial);
	}
	public int getNumeroConta() {
		return numeroConta;
	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
}
	
	public void primeiroDeposito(double saldo) {
		this.saldo += saldo;
		}
	
	public void depositoConta(double quantia) {
		this.saldo += quantia;
	}
	public void sacarConta(double quantia) {
		this.saldo -= quantia + 5.0;
	}
	
	public String toString() {
		return "conta " + numeroConta + ", nome: " + nome + ", saldo " + String.format("%.2f", saldo);
	}
}

