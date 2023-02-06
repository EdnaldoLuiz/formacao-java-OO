package listas;

import java.util.List;

public class TestaCurso {
	public static void main(String[] args) {
		
		Curso java = new Curso("Java", "Paulo");
		
		List<Aula> aulas = java.getAulas();
		System.out.println(aulas);
		
	}

}
