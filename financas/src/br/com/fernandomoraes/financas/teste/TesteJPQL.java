package br.com.fernandomoraes.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fernandomoraes.financas.modelo.Conta;
import br.com.fernandomoraes.financas.modelo.Movimentacao;
import br.com.fernandomoraes.financas.modelo.TipoMovimentacao;
import br.com.fernandomoraes.financas.util.JPAUtil;

public class TesteJPQL {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();

		Conta conta = new Conta();
		conta.setId(1);
		
		// String query = "select m from Movimentacao m where conta_id = 1";
		/*
		 * Como não estamos trabalhando com SQL aqui, e sim com JPQL, conta_id se refere
		 * a uma das colunas da tabela. Porém, neste caso, não trabalharemos mais com
		 * colunas e tabelas, e sim com atributos e classes. Queremos acessar o id da
		 * conta, em Movimentacao. Queremos que quando o id for 1, a Movimentacao seja
		 * retornada. Substituiremos a linha 'String query =
		 * "select m from Movimentacao m where conta_id = 1"' por 'String query =
		 * "select m from Movimentacao m where m.conta.id = 1"';. Assim, selecionaremos
		 * as movimentações (colocamos m como alias para facilitar) cuja conta possui id
		 * 2.
		 */

		String jpql = "select m from Movimentacao m where m.conta = :pConta and m.tipoDeMovimentacao = :pTipo";
		Query query = manager.createQuery(jpql);
		query.setParameter("pConta", conta);
		query.setParameter("pTipo", TipoMovimentacao.ENTRADA);
		List<Movimentacao> resultados = query.getResultList();
		
		for (Movimentacao movimentacao : resultados) {
			System.out.println("Descrição: " + movimentacao.getDescricao());
			System.out.println("Id da Conta: " + movimentacao.getConta().getId());
		}
		
		manager.getTransaction().commit();
		manager.close();
	}

}
