package usingpoo;

import java.util.Locale;
import java.util.Scanner;

public class exercicioBanco {

	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.US);
	
		ContaBancaria conta = criarConta();
		Scanner sc = new Scanner(System.in);
		double valor;
		System.out.println(conta.toString());
		
		
		System.out.println("Enter a deposit value:");
		valor = sc.nextDouble();
		conta.realizarDeposito(valor);
		
		System.out.println("Updated account data:");
		System.out.println(conta.toString());
		
		System.out.println("Enter a withdraw value:");
		
		valor = sc.nextDouble();
		conta.realizarSaque(valor);
		
		System.out.println("Updated account data:");
		System.out.println(conta.toString());
		
		if(sc!=null)
			sc.close();
	}

	public static ContaBancaria criarConta() throws Exception{
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);

			System.out.println("Enter account number: ");
			int numeroDaConta = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter account holder: ");
			String nomeTitular = sc.nextLine();
			
			char hasInitialDeposit;
			System.out.println("Is there na initial depoist (y/n)?");
			hasInitialDeposit = sc.next().charAt(0);
			
			if(Character.compare(hasInitialDeposit, 'y') == 0) {
				System.out.println("Enter initial deposit value: ");
				double depositValue = sc.nextDouble();
				return new ContaBancaria(numeroDaConta, nomeTitular, depositValue);
			}else {
				return new ContaBancaria(numeroDaConta, nomeTitular);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}

}
