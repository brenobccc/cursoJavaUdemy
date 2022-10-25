package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		File file = new File("/home/brenobrito/Documents/projetos/projetos_java/java_completo_poo_udemy/curso_prog_java/src/arquivos/ini.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}finally {
			if(sc!=null) {
				sc.close();
			}
		}
	}

}
