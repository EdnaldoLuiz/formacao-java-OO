package listas;

import java.util.ArrayList;
import java.util.Comparator;

public class TestandoListasDeAula {
	public static void main(String[] args) {
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(new Aula("Revistando as ArrayLists", 21));
		aulas.add(new Aula("Listas de Objetos", 20));
		aulas.add(new Aula("Relacionamento de listas e objetos", 15));
		
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getMinutos));
	}
}
