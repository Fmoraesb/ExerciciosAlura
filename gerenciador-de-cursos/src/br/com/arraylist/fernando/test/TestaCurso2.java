package br.com.arraylist.fernando.test;

import br.com.arraylist.fernando.Aluno;
import br.com.arraylist.fernando.Aula;
import br.com.arraylist.fernando.Curso;

public class TestaCurso2 {

	public static void main(String[] args) {

		Curso curso = new Curso("Dominando as Coleções de Java", "Paulo SIlveira");

		curso.adiciona(new Aula("Revisitando as ArrayList", 21));
		curso.adiciona(new Aula("Listas de Objetos", 20));
		curso.adiciona(new Aula("Relacionamento com Coleções", 24));

		Aluno aluno1 = new Aluno("Klaus", 10001);
		Aluno aluno2 = new Aluno("Lady", 56739);
		Aluno aluno3 = new Aluno("Moleque", 171890);
		Aluno aluno4 = new Aluno("Alfredo", 345673);
		
//		Aluno aluno5 = new Aluno(null, 12223);
		
		curso.matricula(aluno1);
		curso.matricula(aluno2);
		curso.matricula(aluno3);
		curso.matricula(aluno4);
		curso.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		Aluno alunoNovo = new Aluno("Klaus", 10001);
		System.out.println("Os alunos " + aluno1 + " e " + alunoNovo + " são iguais?");
		System.out.println(aluno1.equals(alunoNovo));
		System.out.println("O aluno " + alunoNovo + " está matriculado?");
		System.out.println(curso.estaMatriculado(alunoNovo));
		
//		Set<String> nome = Collections.emptySet();
//		nome.add("Klaus"); // Resultado: "Exception in thread "main" java.lang.UnsupportedOperationException", pois não faz sentido popular
						  // uma lista com null;
		
//		List<Aula> aulasImutaveis = curso.getAulas();
//		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
//		Collections.sort(aulas);
//
//		System.out.println(curso.getAulas());
//		System.out.println(aulas);

//		System.out.println(curso.getTempoTotal());
//		System.out.println(curso);
	}

}
