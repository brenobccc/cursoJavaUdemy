package memoria;
import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		double vetor[] = new double[n];
		
		for(int i = 0; i<vetor.length; i++) {
			System.out.print("\nDigite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		if(vetor.length > 0) {
			double somatorio=0;
			System.out.print("VALORES = ");		
			
			for(int i=0; i<vetor.length; i++) {
				System.out.print(vetor[i] + " ");
				somatorio+=vetor[i];
			}			
			System.out.printf("%nSOMA = %.2f%n", somatorio);
			System.out.printf("MEDIA = %.2f%n", (somatorio/vetor.length));

		}else {
			System.out.println("Não há nenhum valor registrado.");
		}
		sc.close();
	}

}
