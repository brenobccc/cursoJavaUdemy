package secao9;

import java.util.Locale;
import java.util.Scanner;

public class MainSobreCarga {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		
		ProdutoSobreCarga prodSobrecarg = new ProdutoSobreCarga(name,price);
		ProdutoSobreCarga prodSobrecarg2 = new ProdutoSobreCarga(name,price,5);
		
	}
}
