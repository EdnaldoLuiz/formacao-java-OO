package listas;

import java.util.HashMap;
import java.util.Map;

public class d {
	public static void main(String[] args) {
		
		Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        for (int i = 0; i < args.length; i++) {
            System.out.println(nomesParaIdade + "!");
	}

}
}
