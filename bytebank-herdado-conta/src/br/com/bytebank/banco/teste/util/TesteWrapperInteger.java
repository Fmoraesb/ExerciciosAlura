package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		Integer idadeRef = 29; // O Autoboxing � usado aqui, j� que voc� pediu uma refer�ncia e n�o um tipo primitivo;
		int primitivo = new Integer(21); // Aqui acontece o processo inverso, o Unboxing;
		
		List<Integer> lista = new ArrayList<>();
		lista.add(idadeRef); // Aqui tudo certo, j� que toda List guarda refer�ncias;
		lista.add(primitivo); // Aqui acontece outro Autoboxing, j� que � para guardar uma refer�ncia;
		
		int numero1 = lista.get(0); // Unboxing, j� que foi pedido para guardar um n�mero primitivo int;
		Integer numero2 = lista.get(1); // Okay, o Java consegue fazer o processo inverso.
		
		System.out.println(numero1);
		System.out.println(numero2);
		
		Integer valorRef = Integer.valueOf(33); // � delegado ao metodo valueOf() a cria��o de um primitivo int para guardar o valor passado;
		int valorPrimitivo = valorRef.intValue(); // Desembrulha a refer�ncia, atribuindo ao primitivo.
		System.out.println(valorPrimitivo);
		
		Integer valorParseado1 = Integer.valueOf("42"); // Aqui ser� repassado a refer�ncia do valor, j� que quem cria o primitivo � a JVM;
		int valorParseado2 = Integer.parseInt("44"); // Aqui voc� devolve o valor primitivo.
		System.out.println(valorParseado1);
		System.out.println(valorParseado2);
		
		System.out.println("Valor m�ximo que o Integer recebe: " + Integer.MAX_VALUE);
		System.out.println("Valor minimo que o Integer recebe: " + Integer.MIN_VALUE);
		
		System.out.println("Valor de bits armazenado: " + Integer.SIZE);
		System.out.println("Valor de bytes armazenado: " + Integer.BYTES);
		
	}

}
