package curso_prog_java;

public class Exemplo01Casting {
	public static void main(String[] args) {
		int a,b;
		double resultado;
		
		a = 5;
		b = 2;
		//resultado =a/b; Antes(resultado: 2.0)
		resultado = (double) a/b;
		System.out.println(resultado);
	}
	
}
