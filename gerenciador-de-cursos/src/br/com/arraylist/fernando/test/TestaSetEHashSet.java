package br.com.arraylist.fernando.test;

import java.util.HashSet;
import java.util.Set;

public class TestaSetEHashSet {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();
		alunos.add("Klaus");
		alunos.add("Lady");
		alunos.add("Moleque");
		alunos.add("Alfredo");
		
		for (String string : alunos) {
			System.out.println(string);
		}
		
		System.out.println("Antes de tentar inserir um aluno já exitente, temos: ");
		System.out.println(alunos.size());
		
		boolean testeDEIsercao = alunos.add("Klaus");
		System.out.println("Depois de tentar inserir um aluno já exitente, temos: ");
		System.out.println(alunos.size());
		System.out.println("Ou seja, o teste de inserção deu como resultado: " + testeDEIsercao);
   }
}
