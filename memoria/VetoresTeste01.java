package memoria;
import java.util.Scanner;

public class VetoresTeste01 {
	public static void main(String[] args) {
		//int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		
		int[] numero1 = new int[10];		
		
		for(int i=0; i<10; i++) {
			numero1[i] = sc.nextInt();
		}
		
		for(int i=0; i<10; i++) 
			System.out.println(numero1[i]);
		
		sc.close();
	}
}
