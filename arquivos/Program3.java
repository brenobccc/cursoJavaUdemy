package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) {
		String[] lines = new String[] { "Good morning,","afternoon","evening"};
		
		String path = "/home/brenobrito/out.txt";

		/*FileWriter(),cria o arquivo, se tiver ele recriar
		 *FileWriter(path,true) criar o arquivo, e se tiver ele concatena no final do arquivo*/
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
