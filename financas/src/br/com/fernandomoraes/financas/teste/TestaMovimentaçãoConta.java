package br.com.fernandomoraes.financas.teste;

import javax.persistence.EntityManager;
import br.com.fernandomoraes.financas.modelo.Conta;
import br.com.fernandomoraes.financas.modelo.Movimentacao;
import br.com.fernandomoraes.financas.util.JPAUtil;

public class TestaMovimentaçãoConta {

	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();
		
		Movimentacao movimentacao = manager.find(Movimentacao.class, 3);
		Conta conta = movimentacao.getConta();
		
		System.out.println(conta.getTitular());
		
		manager.getTransaction().commit();
		manager.close();
	}

}
