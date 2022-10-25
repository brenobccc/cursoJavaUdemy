package arquivos;

import java.io.File;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String srtPath = sc.nextLine();
		File path = new File(srtPath);
		
		File[] folders = path.listFiles(File::isDirectory);//cria um vetor de file com cada caminho
		
		System.out.println("FOLDERS: ");
		
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("\nFILES: ");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(srtPath + "/teste").mkdir();
		
		System.out.println("Diretório criado com sucessso! " + success);
		
		sc.close();
	}

}
