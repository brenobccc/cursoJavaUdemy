package memoria;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaAlturas {

	public static void main(String[] args) {
		/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas sesao digitadas?  ");
		int n = sc.nextInt();
		Pessoa[] pessoas = new Pessoa[n];
		
		for(int i = 0; i<pessoas.length; i++) {
			sc.nextLine();
			System.out.println("Dados da "+(i+1)+"a pessoa:");
			System.out.print(" Nome:");
			String nome = sc.nextLine();
			System.out.print(" Idade:");
			int idade = sc.nextInt();
			System.out.print(" Altura:");
			double altura = sc.nextDouble();
			
			pessoas[i] = new Pessoa(nome,idade,altura);
		}
		
		for(int i = 0 ; i< pessoas.length; i++) {
			System.out.println(pessoas[i].toString());
		}
		
		System.out.printf("Altura média: %.2f%n",mediaAlturaPessoas(pessoas));
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%", pessoasMenores16Anos(pessoas));
		
		sc.close();
	}
	
	public static double pessoasMenores16Anos(Pessoa pessoas[]) {
		double qtde=0;
		for(int i = 0; i< pessoas.length; i++) {
			//sum+=pessoas[i].getAltura();
			
			if(pessoas[i].getIdade()<16) {
				qtde++;
			}
		}
	
		return qtde*10;
	}
	
	public static double mediaAlturaPessoas(Pessoa pessoa[]) {
		double sum=0;
		for(int i = 0; i< pessoa.length; i++) {
			sum+=pessoa[i].getAltura();
		}
		
		return sum;
	}
}
