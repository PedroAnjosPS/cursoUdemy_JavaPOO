package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();

		list.add("Romário");
		list.add("Ronaldo");
		list.add("Ronaldinho");
		list.add("Calleri");  
		list.add("Hernanes");
		list.add(2, "Casemiro");
		
		System.out.println("Tamanho da nossa lista: " + list.size() + "\n");
		
		for(String nomes : list) {
			System.out.println(nomes);
		}
		
		System.out.println("\n===========================");
		System.out.println(" Remoção de itens da lista ");
		System.out.println("===========================\n");
		
		// list.remove(3);
		
		// remoção por predicado
		list.removeIf(nome -> nome.charAt(0) == 'R');
		
		for(String nomes : list) {
			System.out.println(nomes);
		}
		
		System.out.println("\n===========================");
		System.out.println("        Index of        ");
		System.out.println("===========================\n");
		
		System.out.println("Index of Calleri: " + list.indexOf("Calleri"));
		System.out.println("Index of Calleri: " + list.indexOf("Romário"));
		
		List<String> result = 
		list.stream().filter(nome -> nome.charAt(0) == 'C').collect(Collectors.toList());
		
		System.out.println("\n===========================");
		System.out.println("     Filtrando Listas     ");
		System.out.println("===========================\n");
		
		for(String nomes : result) {
			System.out.println(nomes);
		}
		
		System.out.println("\n===========================");
		System.out.println("         Predicado        ");
		System.out.println("===========================\n");
		
		String name = 
		result.stream().filter(nome -> nome.charAt(0) == 'H').findFirst().orElse(null);
		
		System.out.println(name);
		
	}

}
