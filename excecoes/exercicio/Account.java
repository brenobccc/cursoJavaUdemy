package excecoes.exercicio;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(Double amount) throws Exception{
			if((this.balance+amount) > withdrawLimit) {
				throw new Exception("Limite de conta atingido!!");
			}
			this.balance+=amount;
	}
	
	public void withdraw(Double amount) throws Exception {
			if((this.balance-amount) < 0) {
				throw new Exception("Quantia insuficiente!!");
			}
			this.balance-=amount;
	}
}
