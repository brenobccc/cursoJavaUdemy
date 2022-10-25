package testestatic;

public class Main {

	public static void main(String[] args) {
		SalaDeAula.professor = "Breno";
		SalaDeAula a1 = new SalaDeAula();
		SalaDeAula a2 = new SalaDeAula();
		a1.aluno = "Britinho";
		a1.professor = "José";
		System.out.println(a1.professor);
		System.out.println(a2.professor);
		System.out.println(SalaDeAula.professor);

		System.out.println(SalaDeAula.professor);
		
	}

}
