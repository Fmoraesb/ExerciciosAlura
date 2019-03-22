package br.com.arraylist.fernando.test;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		
		String aula01 = "Analisando Java.io";
		String aula02 = "Dominando as Collections";
		String aula03 = "Android";
		
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(aula01);
		cursos.add(aula02);
		cursos.add(aula03);
		
//		cursos.remove(1);
		System.out.println(cursos);
		String primeiraAula = cursos.get(0);
		System.out.println("A primeira aula ser�: " + primeiraAula);
		
		/*
		 *  Vai dar um IndexOutOfBoundsException, j� que voc� est� tentando acessar uma posi��o n�o populada
		 *  do nosso Array
		 */
		for (int i = 0; i < cursos.size(); i++) { 
			System.out.println("Aula: " + cursos.get(i));
		}
		
		Collections.sort(cursos);
		System.out.println(cursos);
	}

}
