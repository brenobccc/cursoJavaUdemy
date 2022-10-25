import java.util.Locale;

public class Exercicio01SaidaDeDados{
	public static void main(String[] args) {
		String prod1 = "Computer";
		String prod2 = "Office Desk";
		
		int age = 25;
		int code = 3025;
		char gender = 'F';
		
		double price1 = 1000.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:%n%s, which price is $ %.2f",prod1,price1);
		System.out.printf("%n%s, which price is $ %.2f",prod2,price2);
		
		System.out.printf("%nRecord: %d years old, code %d and gender: %c", age,code,gender);
		
		System.out.printf("%nMeasure with eight decimal places: %.8f",measure);
		System.out.printf("%nRouded (three decimal places: %.2f",measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%nUS decimal point: %.2f",measure);
	}
}