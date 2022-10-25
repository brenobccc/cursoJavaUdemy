package exerciciosFixacao;
import java.util.Locale;
import java.util.Scanner;

public class MainCurrencyConverter {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		double dollarPrice = sc.nextDouble();
		double quantityDollarsWouldBeBought = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f",CurrencyConverter.converter(dollarPrice, quantityDollarsWouldBeBought));
		
		if(sc!=null)	
			sc.close();
	}
}
