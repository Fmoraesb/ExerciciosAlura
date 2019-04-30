package br.com.fernandomoraes.financas.teste;

import javax.persistence.EntityManager;

import br.com.fernandomoraes.financas.modelo.Cliente;
import br.com.fernandomoraes.financas.modelo.Conta;
import br.com.fernandomoraes.financas.util.JPAUtil;

public class TestaContaCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Fernando");
		cliente.setEndereco("Rua Fulano, 123");
		cliente.setProfissao("Professor");
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Moleque");
		cliente2.setEndereco("Rua Fulano, 123");
		cliente2.setProfissao("Canino Profissional");
		
		Conta conta = new Conta();
		conta.setId(1);
		cliente.setConta(conta);
		//cliente2.setConta(conta);
		
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();
		manager.persist(cliente);
		//manager.persist(cliente2);
		manager.getTransaction().commit();		
		manager.close();
	}

}
