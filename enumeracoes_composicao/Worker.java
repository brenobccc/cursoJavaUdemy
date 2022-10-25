package enumeracoes_composicao;

import java.util.ArrayList;
import java.util.Calendar;
//import java.util.Date;
import java.util.List;

public class Worker {
	public String name;
	public WorkerLevel level;
	public Double salary;
	public List<HourContract> contracts;
	public Department department;
	
	public Worker(){
		this.contracts = new ArrayList<HourContract>();
		this.department = new Department();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	
	public WorkerLevel getLevel() {
		return this.level;
	}
	
	public Double getSalary() {
		return this.salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract){
		contracts.remove(contract);
	}
	
	public void income(int year, int month) {
		
		List<Double> contractsByMonthAndYear = new ArrayList<Double>();
		
		System.out.println("month - 1 : "+ month);
		
		for(HourContract contract : contracts) {
			int mesEntrada, anoEntrada;
			mesEntrada = contract.getDate().get(Calendar.MONTH);
			anoEntrada = contract.getDate().get(Calendar.YEAR);
			System.out.println("Mes objeto: "+mesEntrada + "Ano objeto: "+anoEntrada);
			
			if((contract.getDate()!=null) && (((month-1) == mesEntrada)) && ((year == anoEntrada))) 
			{
				contractsByMonthAndYear.add(contract.totalValue());
			}
		}
		
		if(contractsByMonthAndYear.size()>0) {
			double geralIncome = 0;
			
			System.out.print("Name: "+this.name + "\nDepartment:"
					+ this.department.getName() + " \nIncome for "+month+"/"+year+": ");
			
			for(Double contract : contractsByMonthAndYear)
					geralIncome+=contract;
			
			geralIncome+=this.salary;
			System.out.printf("%.2f",geralIncome);
		}else
			System.out.println("Não existe contrato neste período consultado!!");			
		
	}
	
	
}
