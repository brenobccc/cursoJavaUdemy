package polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of employeers: ");
		int n = sc.nextInt();
		List<Employee> lista = new ArrayList<Employee>();
		for(int i = 0; i<n; i++) {
			System.out.println("Employe #"+(i+1)+" data:");
			System.out.print("Outsourced (y/n)? ");
			String op = sc.next();
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours:");
			int hours = sc.nextInt();
			System.out.print("Value per hours:");
			double valuePerHour = sc.nextDouble();
			
			if(op.charAt(0) == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				OutsourcedEmployee outSourcedEmployee = new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge);
				lista.add(outSourcedEmployee);
			}else {
				Employee employee = new Employee(name, hours, valuePerHour);
				lista.add(employee);
			}
			
		}
		
		sc.close();
		
		System.out.println("PAYMENTS:");
		for(int i = 0; i<lista.size(); i++) {
			System.out.print(lista.get(i).getName());
			System.out.printf(" - $ %.2f%n ",lista.get(i).payment());
		}

	}

}
