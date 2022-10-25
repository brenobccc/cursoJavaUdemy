import java.util.Locale;

public class Exemplo2SaidaDeDados {
	public static void main(String[] args) {
		/*
		System.out.print("Olá mundo!");
		System.out.println("Bom Dia!");
		
		printf = printa com quebra de linha
		print = imprime somente.
		*/
		
		//inteiro
		int y = 32;
		System.out.println(y);

		//ponto flutuante
		double x = 10.35784;
		System.out.println(x);//imprimindo normalmente.
		System.out.printf("%.2f\n", x);//imprimindo formatado, usando o printf
		Locale.setDefault(Locale.US);//Configurando ponto
		System.out.printf("Ultimo valor: %.4f\n", x);//imprimindo formatado, usando o printf
		
		//Concatenando
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros.\n",x);
		
		
		String nome = "Breno";
		//int idade = 21;
		double precoHamburguer = 18.50;
		//%s = texto, %d = inteiro, %f = ponto flutuante, %n ou \n = quebra a linha
		System.out.printf("O cliene é o %s e ele irá querer uma lanche de %.2f reais.", nome,precoHamburguer);
		
	}
}
