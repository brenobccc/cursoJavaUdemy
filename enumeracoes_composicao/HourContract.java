package enumeracoes_composicao;

import java.util.Calendar;

public class HourContract {
	public Calendar date = Calendar.getInstance();
	public double valuePerHour;
	public int hours;
	
	public void setDate(Calendar data){
		this.date = data;
	}
	
	public Calendar getDate() {
		return this.date;
	}
	
	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public double getValuePerHour() {
		return this.valuePerHour;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getHours() {
		return this.hours;
	}
	
	public double totalValue() {
		return this.hours * this.valuePerHour;
	}

	@Override
	public String toString() {
		return "HourContract [date(dia,mes,ano)=" + date.get(date.DAY_OF_MONTH) + "/" + date.get(date.MONTH) + "/" + date.get(date.YEAR)  + ", valuePerHour=" + valuePerHour + ", hours=" + hours + "]";
	}
	
}
