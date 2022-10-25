package polimorfismo;

public class OutsourcedEmployee extends Employee{
	private Double additionalCharge;
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name,hours,valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	public Double payment() {
		return (this.hours * this.valuePerHour) + ((110.00/100.00)*this.additionalCharge);
	}
	
	public Double getAdditionalCharge() {
		return this.additionalCharge;
	}
	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
}
