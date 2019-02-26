package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		Integer idadeRef = 29; // O Autoboxing é usado aqui, já que você pediu uma referência e não um tipo primitivo;
		int primitivo = new Integer(21); // Aqui acontece o processo inverso, o Unboxing;
		
		List<Integer> lista = new ArrayList<>();
		lista.add(idadeRef); // Aqui tudo certo, já que toda List guarda referências;
		lista.add(primitivo); // Aqui acontece outro Autoboxing, já que é para guardar uma referência;
		
		int numero1 = lista.get(0); // Unboxing, já que foi pedido para guardar um número primitivo int;
		Integer numero2 = lista.get(1); // Okay, o Java consegue fazer o processo inverso.
		
		System.out.println(numero1);
		System.out.println(numero2);
		
		Integer valorRef = Integer.valueOf(33); // É delegado ao metodo valueOf() a criação de um primitivo int para guardar o valor passado;
		int valorPrimitivo = valorRef.intValue(); // Desembrulha a referência, atribuindo ao primitivo.
		System.out.println(valorPrimitivo);
		
		Integer valorParseado1 = Integer.valueOf("42"); // Aqui será repassado a referência do valor, já que quem cria o primitivo é a JVM;
		int valorParseado2 = Integer.parseInt("44"); // Aqui você devolve o valor primitivo.
		System.out.println(valorParseado1);
		System.out.println(valorParseado2);
		
		System.out.println("Valor máximo que o Integer recebe: " + Integer.MAX_VALUE);
		System.out.println("Valor minimo que o Integer recebe: " + Integer.MIN_VALUE);
		
		System.out.println("Valor de bits armazenado: " + Integer.SIZE);
		System.out.println("Valor de bytes armazenado: " + Integer.BYTES);
		
	}

}
