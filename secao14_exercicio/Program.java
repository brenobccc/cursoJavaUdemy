package secao14_exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws Exception{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		try {
			System.out.print("Enter the number of tax payers: ");
			
			int qtdTaxPayers = sc.nextInt();
			List<Pessoa> lista = new ArrayList<Pessoa>();
			for(int i = 0; i < qtdTaxPayers; i++) {
				System.out.println("Tax payer #"+i+" data:");
				System.out.print("Individual or company (i/c)? ");
				char kindPerson = sc.next().charAt(0);
				
				sc.nextLine();
				System.out.print("Name: ");
				String nome = sc.nextLine();

				System.out.print("Anual income: ");
				double rendaAnual = sc.nextDouble();
				
				if(kindPerson == 'i') {

					System.out.print("Helath expenditures: ");
					double healthExpenditures = sc.nextDouble();
					PessoaFisica pessoaFisica = new PessoaFisica(nome,rendaAnual,healthExpenditures);
					lista.add(pessoaFisica);
				}else if(kindPerson == 'c') {

					System.out.print("Number of employees: ");
					int numbersOfEmployees = sc.nextInt();
					PessoaJuridica pessoaJuridica = new PessoaJuridica(nome,rendaAnual,numbersOfEmployees);
					lista.add(pessoaJuridica);
				}
			}
			
			double totalTaxes = 0.00;
			for(Pessoa p : lista) {
				System.out.printf("%s: $ %.2f%n",p.nome,p.calcularImposto());
				totalTaxes += p.calcularImposto();
			}
			
			System.out.printf("%nTOTAL TAXES: $ %.2f",totalTaxes);
			
		}catch(Exception e) {
			e.printStackTrace();	
		}finally {
			if(sc!=null) {
				sc.close();
			}
		}		
	}
}
