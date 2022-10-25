package memoria;
import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioNumerosParesPrograma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar?");
		int listaNumeros[] = new int [sc.nextInt()];
		
		for(int i = 0; i<listaNumeros.length; i++) {
			System.out.println("Digite um numero: ");
			listaNumeros[i] = sc.nextInt();
			
		}
		
		ArrayList listaNumerosPares = new ArrayList<>();
		for(int num : listaNumeros) {
			if(num%2==0) {
				listaNumerosPares.add(num);
			}
		}
		
		
		if(listaNumerosPares.size()<1) {
			System.out.println("Não há nenhum numero par");
		}else {
			System.out.println("Números Pares:");
			for(int i=0; i<listaNumerosPares.size(); i++) {
				System.out.println(listaNumerosPares.get(i));
			}	
			
			System.out.println("QUANTIDADE DE PARES: ");
			System.out.println(listaNumerosPares.size());
		}
		
		
		
		
		
	
		
		
		sc.close();
	}

}
