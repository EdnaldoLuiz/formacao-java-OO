package listas;
import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		
		ArrayList<String> cursos = new ArrayList<>();
		
		cursos.add(new String("Java 8: tire proveito dos novos cursos da linguagem"));
		cursos.add(new String("Apache Camel"));
		cursos.add(new String("Certificação Java SE 8 Programmer I"));
		
		System.out.println(cursos);
		
		System.out.println("O primeiro curso da lista é o: " + cursos.get(0));
		
		Collections.sort(cursos);
		
		System.out.println(cursos);
		
		
	}
}
