package excecoes.exercicio;

public class Main {

	public static void main(String[] args) {
		try {
			Account conta = new Account(1,"Breno",2000.00,4000.00);
			conta.deposit(6000.00);
			System.out.println("Funcionou");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
