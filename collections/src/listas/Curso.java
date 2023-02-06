package listas;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Aluno buscaMatriculado(Aluno aluno) {
		return this.matriculaParaAluno.get(aluno.getNumeroMatricula());
	}
	
	public Aluno buscaMatriculado(int numero) {
		return this.matriculaParaAluno.get(numero);
	}
	
	public int getTempototal() {
		int tempoTotal = 0;
		for(Aula aula: aulas) {
			tempoTotal += aula.getMinutos();
		}
		return tempoTotal;
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", tempo total: " + this.getTempototal() + ", aulas: " + aulas + "]";
	}
	
	
}
		//return this.aulas.stream().mapToInt(Aula::getMinutos).sum();


