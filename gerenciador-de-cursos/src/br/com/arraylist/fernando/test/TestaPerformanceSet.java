package br.com.arraylist.fernando.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformanceSet {

	public static void main(String[] args) {
		
//		Collection<Integer> numeros = new ArrayList<>();
		Collection<Integer> numeros = new HashSet<>();
		long inicio = System.currentTimeMillis();
		
		long inicioDaInsercao = System.currentTimeMillis();
		for (int i = 1; i < 100000; i++) {
			numeros.add(i);
		}
		long fimDaInsercao = System.currentTimeMillis();
		long totalDeInsercao = fimDaInsercao - inicioDaInsercao;
		System.out.println("Tempo total para inserção: " + totalDeInsercao);
		
		long inicioDaIteracao = System.currentTimeMillis();
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}
		long fimDaIteracao = System.currentTimeMillis();
		long totalDeIteracao = fimDaIteracao - inicioDaIteracao;
		System.out.println("Tempo total para Iteração: " + totalDeIteracao);
		
		
		long fim = System.currentTimeMillis();
		long tempoDeExecucao = fim - inicio;
		System.out.println("Tempo total gasto: " + tempoDeExecucao);

	}

}
