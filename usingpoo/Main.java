package usingpoo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle x,y;
		
		//Instanciando os objetos
		x = new Triangle();
		y = new Triangle();

		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.calcularAreaTringulo();
		double areaY = y.calcularAreaTringulo();
		
		System.out.printf("Triangle  X area: %.4f%n", areaX);
		System.out.printf("Triangle  Y area: %.4f%n", areaY);
		
		System.out.println(areaX > areaY ? "Larger area: X" : "Larger area Y"); 
		
		if(sc!=null) sc.close();*/
		
		/*//testando products
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product produto = new Product();
		
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		produto.setName(sc.nextLine());

		System.out.print("Price:");
		produto.setPrice(sc.nextDouble());
		
		System.out.println("Quantity in stock: ");
		produto.setQuantity(sc.nextInt());
		
		//System.out.println(produto.toString());
		System.out.println(produto);
		
		System.out.println("Enter the number of products to be added in stock");
		int quantity = sc.nextInt();
		produto.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: "+produto+"\n");
		
		System.out.println("Enter the number of products to be removed from stock");
		quantity = sc.nextInt();
		produto.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: "+produto+"\n");
		
		if(sc!=null) sc.close();
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Calculator calc = new Calculator();
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n",c);
		System.out.printf("Volume: %.2f%n",v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();
		

	}

}
