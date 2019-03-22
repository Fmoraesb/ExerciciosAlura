package br.com.arraylist.fernando.test;

import java.util.ArrayList;
import java.util.Collections;

import br.com.arraylist.fernando.Aula;

import java.util.*;

public class TestaListaDeAula {

	public static void main(String[] args) {
		
		Aula aula1 = new Aula("Revisitando as ArrayList", 21);
		Aula aula2 = new Aula("Listas de Objetos", 20);
		Aula aula3 = new Aula("Relacionamento de Listas e Objetos", 15);

		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		/*
		 * Dessa maneira, ele irá imprimir o pacote, um pointer (@) e o HashCode da classe. Só irá imprimir
		 * o que queremos mesmo após sobreecrever o método ToString na nossa classe.
		 */
		System.out.println(aulas);
		
		/*
		 * O sort do Collections só funciona em uma classe nossa depois de implementar a interface Comparable,
		 * pois é ela que define o critério de comparação a ser utilizado.
		 */
		Collections.sort(aulas);
		System.out.println(aulas);
		
		/*
		 * Podemos ler essa linha da seguinte forma para entender: Estou pedindo para o meu ArrayList aulas
		 * ordenar a si mesma usando como padrão da classe Comparator a classe Aula e usando o atributo tempoDeAula
		 */
		aulas.sort(Comparator.comparing(Aula::getTempoDeAula));
		System.out.println(aulas);
	}

}
