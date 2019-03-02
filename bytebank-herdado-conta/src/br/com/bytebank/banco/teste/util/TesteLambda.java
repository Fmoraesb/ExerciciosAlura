package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteLambda {

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
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        
        lista.sort(new Comparator<Conta>() { // Isso se chama Classe An�nima! J� que eu n�o preciso de um Objeto.

        	@Override
        	public int compare(Conta conta1, Conta conta2) {

        		return Integer.compare(conta1.getNumero(), conta2.getNumero());
        	}
        });
        
//        lista.sort(new Comparator<Conta>() { // Elas deixam o c�digo mais enxuto tamb�m, apesar de deixar a legibilidade meio pobre.
//
//        	@Override
//        	public int compare(Conta conta1, Conta conta2) {
//        		
//        		String nomeConta1 = conta1.getTitular().getNome();
//        		String nomeConta2 = conta2.getTitular().getNome();
//        		return nomeConta1.compareTo(nomeConta2);
//        	}	
//        }); 
        
        System.out.println("Depois do Sort:");
        
        for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getTitular().getNome() + ", Saldo: " + conta.getSaldo());
		}
	}

}