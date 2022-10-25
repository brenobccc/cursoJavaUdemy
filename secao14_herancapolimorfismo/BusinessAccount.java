package secao14_herancapolimorfismo;

public class BusinessAccount extends Account{
	private Double loanlimit;
	
	public BusinessAccount() {
		
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanlimit) {
		super(number, holder, balance);//executa a lógica do construtor da classe base.
		this.loanlimit = loanlimit;
	}

	public Double getLoanlimit() {
		return loanlimit;
	}

	public void setLoanlimit(Double loanlimit) {
		this.loanlimit = loanlimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanlimit)
			balance += amount - 10.0;
	}
}
 