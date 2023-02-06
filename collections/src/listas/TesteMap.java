package listas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteMap {

    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        
        Collection<Integer> valores = nomesParaIdade.values();
        valores.forEach(System.out::println);
        
        Set<String> chave = nomesParaIdade.keySet();
        chave.forEach(System.out::println);
        
        Set<Entry<String, Integer>> associados = nomesParaIdade.entrySet();
        
        for (Entry<String, Integer> entry : associados) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
        
        for (Entry<String, Integer> entry : associados) {
			System.out.println(entry);
		}
    }
}