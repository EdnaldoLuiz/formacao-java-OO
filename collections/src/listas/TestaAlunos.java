package listas;

import java.util.Set;

public class TestaAlunos {
	
	public static void main(String[] args) {
		
		Curso java = new Curso("Java", "Eu");
		
		java.adiciona(new Aula("Python", 12));
		java.adiciona(new Aula("PHP", 23));
		java.adiciona(new Aula("C#", 17));
		
		java.matricula(new Aluno("Ednaldo", 38578));
		
		java.getAlunos().forEach(System.out::println);
		
		Set<Aluno> alunos = java.getAlunos();
		
		alunos.add(new Aluno("Luiz", 9245));
		Aluno a1 = new Aluno("Luiz", 9245);
		
		Aluno aluno = java.buscaMatriculado(a1);
		
		//não pode adicionar diretamente
	}

}
