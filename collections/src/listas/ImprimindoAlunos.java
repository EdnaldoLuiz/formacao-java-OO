package listas;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunos {
	
	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Ednaldo");
		alunos.add("Foi");
		alunos.add("Luiz");
		alunos.add("Luiz");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println(alunos.size());
		
		boolean adicionou = alunos.add("Foi");
		System.out.println(adicionou);
	}

}
