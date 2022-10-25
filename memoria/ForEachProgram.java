package memoria;

public class ForEachProgram {
	public static void main(String[] args) {
		String[] vect = new String[] {"Maria","Bob", "Alex"};
		
		/*for(int i =0; i < vect.length; i++) {
			
		}*/
		
		for(String v : vect) {
			System.out.println(v);
		}
	}
}
