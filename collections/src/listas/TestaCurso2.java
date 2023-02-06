package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	public static void main(String[] args) {
		
		Curso java = new Curso("Java", "Paulo");
		
		java.adiciona(new Aula("Trabalhando com ArrayList", 21));
		java.adiciona(new Aula("Criando uma aula", 2));
		java.adiciona(new Aula("Modelando com coleções", 22));
		
		List<Aula >aulasImutaveis = java.getAulas();
		System.out.println(java.getAulas());
		
		List<Aula> aula = new ArrayList<>(aulasImutaveis);
		Collections.sort(aula);
		System.out.println(aula);
		
		System.out.println(java);
	}

}
