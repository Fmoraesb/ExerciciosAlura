package br.com.fernandomoraes.financas.teste;

import javax.persistence.EntityManager;
import br.com.fernandomoraes.financas.modelo.Conta;
import br.com.fernandomoraes.financas.util.JPAUtil;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setTitular("Fernando");
		conta.setBanco("Banco do Brasil");
		conta.setAgencia("123");
		conta.setNumero("456");
		
		/**
		 * Essas linhas servem para criar a conex�o atrav�s de uma Factory, sendo passado o nome do banco ("financas"),
		 * cria uma entidade que serve para coordenar a cria��o do banco de dado;
		 * O Manager inicia a transa��o de comunica��o com o sistema de banco de dados, "persiste" o objeto e
		 * executa o commit, para poder oficializar a inser��o.
		 */
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
		em.close();
	}

}
