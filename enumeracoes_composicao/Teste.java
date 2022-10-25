package enumeracoes_composicao;

import java.util.Calendar;
import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		Calendar data = Calendar.getInstance();
		
		
		data.set(2007,0,16);
		System.out.println(data.getTime());
		System.out.println(data.get(Calendar.YEAR));
		System.out.println(data.get(data.YEAR));
		
		/*int hora = data.get(Calendar.HOUR_OF_DAY);
		
		if(hora > 6 && hora < 12) {
			System.out.println("Bom Dia");
		}else if(hora > 12 && hora < 18) {
			System.out.println("Boa Tarde");
		}else {
			System.out.println("Boa Noite");
		}*/
		
		
	}

}
