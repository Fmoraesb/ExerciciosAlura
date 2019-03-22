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
		 * Dessa maneira, ele ir� imprimir o pacote, um pointer (@) e o HashCode da classe. S� ir� imprimir
		 * o que queremos mesmo ap�s sobreecrever o m�todo ToString na nossa classe.
		 */
		System.out.println(aulas);
		
		/*
		 * O sort do Collections s� funciona em uma classe nossa depois de implementar a interface Comparable,
		 * pois � ela que define o crit�rio de compara��o a ser utilizado.
		 */
		Collections.sort(aulas);
		System.out.println(aulas);
		
		/*
		 * Podemos ler essa linha da seguinte forma para entender: Estou pedindo para o meu ArrayList aulas
		 * ordenar a si mesma usando como padr�o da classe Comparator a classe Aula e usando o atributo tempoDeAula
		 */
		aulas.sort(Comparator.comparing(Aula::getTempoDeAula));
		System.out.println(aulas);
	}

}
