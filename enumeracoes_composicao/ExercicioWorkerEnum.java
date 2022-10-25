package enumeracoes_composicao;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioWorkerEnum {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Worker trabalhadorBrasileiro = new Worker();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		trabalhadorBrasileiro.department.setName(sc.nextLine());
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		trabalhadorBrasileiro.setName(sc.nextLine());
		System.out.println("Level: ");
		trabalhadorBrasileiro.setLevel(WorkerLevel.valueOf(sc.nextLine()));
		System.out.print("Base salary: ");
		trabalhadorBrasileiro.setSalary(sc.nextDouble());
		System.out.print("How many contracts to this worker? ");
		
		int qtyContracts = sc.nextInt();
		
		for(int i=0; i<qtyContracts; i++) {
			
			HourContract contrato = new HourContract();
			
			System.out.println("Enter contract #"+(i+1)+" data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			
			int dia, mes, ano;
			dia = mes = ano = 0;
			String[] datas = sc.next().split("/");
			
			/*if(datas.length==3) {
				dia = Integer.parseInt(datas[0]);
				mes = Integer.parseInt(datas[1]);
				ano = Integer.parseInt(datas[2]);
			}*/
			
			//Date data = new Date();
			Calendar data = Calendar.getInstance();
			
			dia = Integer.parseInt(datas[0]);
			mes = datas[1] != null && (Integer.parseInt(datas[1])>0) ? Integer.parseInt(datas[1]) : null;
			ano = Integer.parseInt(datas[2]);
		
			data.set(ano,mes-1,dia);
			
			contrato.setDate(data);
			System.out.println(contrato.toString());
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			contrato.setValuePerHour(valuePerHour);
			
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			contrato.setHours(hours);
			
			trabalhadorBrasileiro.addContract(contrato);
			//trabalhadorBrasileiro.contracts
			
			
		}
		
		
		System.out.println("Enter month and year to calculate income (MM/YYY): ");
		String[] incomes = sc.next().split("/");
		
		trabalhadorBrasileiro.income(Integer.parseInt(incomes[1]), Integer.parseInt(incomes[0]));
	
		//System.out.print("Informe a quantidade de contratos: ");
		
		
		if(sc!=null)
			sc.close();
	}

}
