package br.com.arraylist.fernando.test;

import br.com.arraylist.fernando.Aula;
import br.com.arraylist.fernando.Curso;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso curso = new Curso("Dominando as Coleções de Java", "Paulo SIlveira");
		
//		curso.getAulas().add(new Aula("Revisitando as ArrayList", 21)); Isso é uma boa prática no mundo de OO! Dessa forma, você
//																		impede que quem for usar sua classe saiba como ela faz as coisas!
		curso.adiciona(new Aula("Revisitando as ArrayList", 21));
//		curso.getAulas().add(new Aula("Listas de Objetos", 20));
		curso.adiciona(new Aula("Listas de Objetos", 20));
//		curso.getAulas().add(new Aula("Relacionamento com Coleções", 15));
		curso.adiciona(new Aula("Relacionamento com Coleções", 15));
		
		System.out.println(curso.getAulas());
	}

}
