package br.com.fernandomoraes.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fernandomoraes.financas.modelo.Categoria;
import br.com.fernandomoraes.financas.modelo.Movimentacao;
import br.com.fernandomoraes.financas.modelo.TipoMovimentacao;
import br.com.fernandomoraes.financas.util.JPAUtil;

public class TesteMovimentacoesPorCategoria {

	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();

		Categoria categoria = new Categoria();
		categoria.setId(1);

		String jpql = "select m from Movimentacao m join m.categoria c where c = :pCategoria";
		Query query = manager.createQuery(jpql);
		query.setParameter("pCategoria", categoria);
		List<Movimentacao> resultados = query.getResultList();
		
		for (Movimentacao movimentacao : resultados) {
			System.out.println("Descrição: " + movimentacao.getDescricao());
			System.out.println("Id da Conta: " + movimentacao.getConta().getId());
		}
		manager.getTransaction().commit();
		manager.close();
	}

}
