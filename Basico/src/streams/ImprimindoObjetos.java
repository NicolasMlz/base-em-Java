package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Nicolas", "Ana");
		
		//Modo 1 de exibi��o
		System.out.println("Usando o foreach");
		for(String nome : aprovados) {
			System.out.println(nome);
		}
		
		//Modo 2 de exibi��o
		System.out.println("\nUsando o iterator");
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Modo 3 de exibi��o
		System.out.println("\nUSANDO O STREAM");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);;
	}
}
