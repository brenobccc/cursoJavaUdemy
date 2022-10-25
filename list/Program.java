package list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Breno");
		list.add(2, "Marco");//inserindo na posição 2
		System.out.println("Tamanho da lista: "+list.size());
		
		
		for(String x : list) {
			System.out.println(x);
		}
	
		System.out.println("-------------------");
		//list.remove("Anna");
		//list.remove(1);
		//Predicado, ex: Seu quiser todos que começam com a letra "m".
		list.removeIf(x -> x.charAt(0) == 'M');//funcao lambda
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		//encontrando a posição de um elemento
		System.out.println("Index of Breno: " + list.indexOf("Breno"));
		//quando não encontro o elemento
		System.out.println("Index of manelelel" + list.indexOf("manelelel"));
		
		System.out.println("-----------------------------");
		//Filtrando e deixando na lista pra deixar quem fica só com "b";
		//declara uma nova lista
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
				//convetor
				//faco a funcao lambda
				//converto de stream para lista novamente
		for(String x : result) {
			System.out.println(x);
		}
			
		//ENCONTRANDO O PRIMEIRO ELEMENTO QUE COMECA COM A LETRA a
		System.out.println("-----------------------");
		String name = list.stream().filter(x -> x.charAt(0) =='A').findFirst().orElse(null);
		//pega o primeiro elemento de acordo com o filtro, se não achar o cara ele bota nulo.
		System.out.println("Nome: "+name);
	}
}
