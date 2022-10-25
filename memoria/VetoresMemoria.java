package memoria;
import java.util.Scanner;
import java.util.Locale;

public class VetoresMemoria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		
		for(int i=0; i<vect.length; i++) {
			sc.next();
			//sc.nextInt();//consumindo a quebra de linha
			String name = sc.nextLine();
			double price = sc.nextDouble();
		
			vect[i] = new Product(name,price);
		};
		
		double sum = 0.0;
		for(int i = 0; i < vect.length ; i++) {
			sum += vect[i].getPrice();//acesso o vetor na posição e dou um get
		}
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n",avg);
		
		sc.close();
	}

}
