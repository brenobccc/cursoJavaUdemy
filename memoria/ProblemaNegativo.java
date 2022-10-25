package memoria;
import java.util.ArrayList;
import java.util.Scanner;

public class ProblemaNegativo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numero voce vai digitar?");
		int qtdeNums = sc.nextInt();
		int[] listNums = new int[qtdeNums];
		ArrayList listNumsNegativos = new ArrayList<>();

		for(int i = 0; i < listNums.length; i++) {
			System.out.println("Digite um numero: ");
			int num = sc.nextInt();
			
			if(num < 0) 
				listNumsNegativos.add(num);
			else 
				listNums[i] = num;
		}
		
		
		if(listNumsNegativos.size() == 0)
			System.out.println("Não há nenhum número vazio");
		else {
			System.out.println("NUMEROS NEGATIVOS:");
			for(int i=0; i < listNumsNegativos.size(); i++) {
				System.out.println(listNumsNegativos.get(i));
			} 
		}
		
		sc.close();
	}
}
