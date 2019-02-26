package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {

//		List<Conta> lista = new ArrayList<Conta>(); Ou
//		List<Conta> lista = new LinkedList<Conta>(); Ou. Todo funcionam, por serem todas Lists!
		List<Conta> lista = new Vector<Conta>();
		
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);	
		Conta cc2 = new ContaPoupanca(22, 22);
		lista.add(cc1);
		lista.add(cc2);
	
		System.out.println("Tamanho: " + lista.size());
		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());
		
		ContaCorrente cc3 = new ContaCorrente(22, 33);	
		Conta cc4 = new ContaPoupanca(22, 44);
		lista.add(cc3);
		lista.add(cc4);
	
//		for (int i = 0; i < lista.size(); i++) {
//			Object referencia = lista.get(i);
//			System.out.println(referencia);
//		}
//		Por ser mais código legado, ainda se escreve e se encontra o "for" da maneira acima.
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}
