package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploCursos {
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
		
		cursos.stream()
		.filter(s -> s.getAlunos() > 50)
		.forEach(System.out::println);
		
		Stream<String> nomes = cursos.stream().map(Curso::getNome);
		
		cursos.stream()
		.filter(s -> s.getAlunos() > 50)
		.forEach(n -> System.out.println(n.getNome()));
		
		
		//O código a seguir cria um Stream<Integer> com a quantidade de 
		//alunos dos cursos e em seguida imprime todos eles.
		
		cursos.stream()
		.filter(c -> c.getAlunos() > 50)
		.map(c -> c.getAlunos())
		.forEach(x -> System.out.println(x));
		
		//Mais simplificado com o method reference
		
		cursos.stream()
		.filter(c -> c.getAlunos() > 50)
		.map(Curso::getAlunos)
		.forEach(System.out::println);
		
		cursos.stream().filter(c -> c.getAlunos() > 100).findAny();
		
		Optional<Curso> curso = cursos.stream()
		.filter(a -> a.getAlunos() > 50)
		.findFirst();
		
		cursos.stream().mapToInt(c -> c.getAlunos()).average();
		
		Stream<Curso> stream = cursos.stream()
				.filter(c -> c.getAlunos() > 50);
		
		List<Curso> cursosFiltrados = cursos.stream()
				.filter(c -> c.getAlunos() > 50)
				.collect(Collectors.toList());
		
		
		
	}

}
