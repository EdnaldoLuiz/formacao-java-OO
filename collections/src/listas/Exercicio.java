package listas;

import java.util.HashMap;
import java.util.Map;

public class Exercicio {
	public static void main(String[] args) {
		
		Map<Integer, String> pessoas = new HashMap<>();
		
		pessoas.put(1, "Ednaldo");
		pessoas.put(2, "Fomos");
		pessoas.put(3, "Foi");
		pessoas.put(4, "Luiz");
		
		pessoas.keySet().forEach(idade -> {System.out.println(pessoas.get(idade));});
	}

}
