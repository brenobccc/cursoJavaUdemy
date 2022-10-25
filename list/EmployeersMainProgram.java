package list;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeersMainProgram {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		
			System.out.println("How many employees will be registered?");
			int qtyEmployees = sc.nextInt();
			
			List<Employee> listEmployeers = new ArrayList<Employee>();
			
				
			for(int i = 0; i<qtyEmployees;i++) {
				System.out.println("Employee #"+(i+1)+":");
				System.out.println("Id: ");
				int id = sc.nextInt();
				System.out.println("Name: ");
				sc.next();
				String name = sc.nextLine();
				System.out.println("Salary: ");
				double salary = sc.nextDouble();
				
				listEmployeers.add(new Employee(id,name,salary));
			}
			
			
			System.out.println("Enter the employee id that will have salary increase :");
			int idToHaveIncreaseSalary = sc.nextInt();
			
			int value = verifyExistyId(listEmployeers,idToHaveIncreaseSalary);
			
			if(listEmployeers != null && value!=-1) {
				double increasePercentage = sc.nextDouble();
				listEmployeers.get(value).salaryIncrease(increasePercentage);
				System.out.println("increase successed");
			}else {
				System.out.println("This id does not exist!");
			}
			
			if(listEmployeers.size()>0) {
				//System.out.println("entrou");
				for(Employee e : listEmployeers) {
					System.out.println(e.toString());
				}
			}
				

			sc.close();
	}
	
	public static int verifyExistyId(List<Employee> listE, int id){
		for(int i = 0 ; i < listE.size() ; i++) {
			if(listE.get(i).getId() == id) {
				return i;
			}
		}
		
		return -1;
		
	}
		
}
