package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdencao {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);
		
		List<Conta> lista = new ArrayList<>();
		
//		Conta cc1 = new ContaCorrente(22, 33);
//        cc1.deposita(333.0);
//        Conta cc2 = new ContaPoupanca(22, 44);
//        cc2.deposita(444.0);
//        Conta cc3 = new ContaCorrente(22, 11);
//        cc3.deposita(111.0);
//        Conta cc4 = new ContaPoupanca(22, 22);
//        cc4.deposita(222.0);

        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        
        System.out.println("Antes do Sort:");
        
        for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getTitular().getNome() + ", Saldo: " + conta.getSaldo());
		}
        
//        ComparadorNumeroConta comparador = ; Já que não preciso guardar a referência, melhor criar na hora de usar somente.
//        ComparadorTitularConta compTitular = ; O mesmo motivo da nota acima.
//        lista.sort(new ComparadorNumeroConta());
//        lista.sort(new ComparadorTitularConta()); Vamos comentar isso tudo para podermos comparar com o Collections.
        Collections.sort(lista);
        
        System.out.println("--------------------");
        System.out.println("Depois do Sort:");
        
        for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getTitular().getNome() + ", Saldo: " + conta.getSaldo());
		}
	}

}

class ComparadorTitularConta implements Comparator<Conta> {

	@Override
	public int compare(Conta conta1, Conta conta2) {
		
		String nomeConta1 = conta1.getTitular().getNome();
		String nomeConta2 = conta2.getTitular().getNome();
		return nomeConta1.compareTo(nomeConta2);
	}
	
}

class ComparadorNumeroConta implements Comparator<Conta> {

	@Override
	public int compare(Conta conta1, Conta conta2) {
		
//		if (conta1.getNumero() < conta2.getNumero()) {
//			return -1;
//		}
//		if (conta1.getNumero() > conta2.getNumero()) {
//			return 1;
//		}
//		return 0;
//		
//		Também podemos fazer da seguinte forma:
		
//		return conta1.getNumero() - conta2.getNumero();
//		
//		Também podemos fazer da seguinte forma (2º round):
		
		return Integer.compare(conta1.getNumero(), conta2.getNumero());
	}
	
}
