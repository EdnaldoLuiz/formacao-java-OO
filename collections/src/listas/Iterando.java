package listas;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Iterando {
	
	public static void main(String[] args) {
		
		Set<String> lista = new LinkedHashSet<>();
		
		lista.add("A");
		lista.add("F");
		lista.add("A");
		
		Iterator<String> it = lista.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
