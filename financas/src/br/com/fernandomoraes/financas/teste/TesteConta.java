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
		 * Essas linhas servem para criar a conexão através de uma Factory, sendo passado o nome do banco ("financas"),
		 * cria uma entidade que serve para coordenar a criação do banco de dado;
		 * O Manager inicia a transação de comunicação com o sistema de banco de dados, "persiste" o objeto e
		 * executa o commit, para poder oficializar a inserção.
		 */
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
		em.close();
	}

}
