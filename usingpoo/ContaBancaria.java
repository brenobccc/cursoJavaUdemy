package usingpoo;

public class ContaBancaria {
	private int numero;
	private String titular;
	private double saldo;
	
	ContaBancaria(int numero, String titular, double valorDepositoInicial){
			this.numero = numero;
			this.titular = titular;
			this.saldo = valorDepositoInicial;
	}
    
	ContaBancaria(int numero, String titular){
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0;	
	}
	
	public void realizarDeposito(double valorDepositado) {
		this.saldo += valorDepositado;
	}
	
	public void realizarSaque(double valorSaque) {
		this.saldo = (this.saldo - valorSaque) - 5; 
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getNumero() {
		return numero;
	}

	public String toString() {
		return "ContaBancaria [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
}
