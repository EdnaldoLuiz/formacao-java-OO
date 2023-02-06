package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura");
		palavras.add("rocketseat");
		palavras.add("caelum");
		
		palavras.forEach(p -> System.out.println(p));
		palavras.forEach(System.out::println);
		
		Comparador comparador = new Comparador();
		
		palavras.sort(comparador);
		
		palavras.forEach(System.out::println);
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		palavras.sort((s1, s2) -> s1.length() - s2.length());
		palavras.sort(Comparator.comparing (s -> s.length()));
		palavras.sort(Comparator.comparing (String::length));
		palavras.sort((String.CASE_INSENSITIVE_ORDER));
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("a");
			}
		}).start();
		
		new Thread(() -> System.out.println("a")).start();
		
		
	}
}