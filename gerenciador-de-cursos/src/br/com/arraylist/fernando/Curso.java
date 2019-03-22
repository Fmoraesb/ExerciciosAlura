package br.com.arraylist.fernando;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nomeDoCurso;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<Aluno>();

	public Curso(String nomeDoCurso, String nomeDoInstrutor) {
		this.nomeDoCurso = nomeDoCurso;
		this.instrutor = nomeDoInstrutor;
	}

	public String getNomeDoCurso() {
		return nomeDoCurso;
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

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempoDeAula();
		}

		// return this.aulas.stream().mapToInt(Aula::getTempoDeAula).sum(); // Esse é o
		// método criado no Java 8, que facilita esse tipo
		// de exercício!
		return tempoTotal;
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		System.out.println("Aluno adicionado com sucesso!");
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	@Override
	public String toString() {
		return "[Curso: " + nomeDoCurso + ", tempo total: " + this.getTempoTotal() + " min, Aulas: [" + this.aulas
				+ "] ]";
	}
}
