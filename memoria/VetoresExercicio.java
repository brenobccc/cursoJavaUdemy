package memoria;
import java.util.Locale;
import java.util.Scanner;

public class VetoresExercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//Criação do vetor.
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		System.out.println(calcularAlturaMedia(vect, n));
		
		sc.close();
		
	}
	
	public static double calcularAlturaMedia(double[] vect, int n) {
		double sum = 0.0;
		
		for(int i = 0; i<n; i++) {
			sum += vect[i];
		}
		
		return sum/n;
	}

}
