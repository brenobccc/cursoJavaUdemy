package exerciciosFixacao;

//classe utilitária
public class CurrencyConverter {
	
	public static final double IOF = 6.0;
	
	public static double converter(double dollar, double quantity) {
		double value = dollar * quantity;
		return value += (value * IOF)/100;
	}
}
