package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencia {

	public static void main(String[] args) {

		Conta[] contas = new Conta[5];
        ContaCorrente cc1 = new ContaCorrente(22, 11);
        contas[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        contas[1] = cc2;    

        System.out.println(contas[1].getNumero());

        ContaCorrente ref = (ContaCorrente) contas[0];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
        
        ContaPoupanca ref1 = (ContaPoupanca) contas[1];
        System.out.println(ref.getNumero());

		
		
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
//		
//		ContaCorrente cc = new ContaCorrente(333, 222);
//		ContaPoupanca cp = new ContaPoupanca(111, 321);
//		 
//		System.out.println(cc);
//		System.out.println(cp);
	}

}
