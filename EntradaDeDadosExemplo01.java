import java.util.Locale;
import java.util.Scanner;
public class EntradaDeDadosExemplo01 {

	public static void main(String[] args) {		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//lendo string
		//String x = sc.next();
		//System.out.println("(string)Você digitou: "+ x);
		
		//lendo inteiro
		//int valorInteiro = sc.nextInt();
		//System.out.println("(int) Você digitou: " + valorInteiro);
		//double valorDouble = sc.nextDouble();
		//System.out.printf("Você digitou: %.2f",valorDouble);
		
		//Lendo caractere
		char valorCaractere;
		
		valorCaractere = sc.next().charAt(0);
		
		System.out.printf("Você digitou: %.2f%n", valorCaractere);
		
		if(sc!=null)
				sc.close();

	}

}
