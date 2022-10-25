import java.util.Scanner;
public class LerAteQuebraLinha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1,s2,s3;
		
		x = sc.nextInt();
		sc.nextLine();//Irá evitar o bug da quebra de linha pendente.
		//next: le apenas uma palavra, nextLine: lê a linha toda.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		if(sc!=null) sc.close();
	}
	
}
