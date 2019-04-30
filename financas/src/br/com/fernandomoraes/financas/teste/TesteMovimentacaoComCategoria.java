package br.com.fernandomoraes.financas.teste;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.fernandomoraes.financas.modelo.Categoria;
import br.com.fernandomoraes.financas.modelo.Conta;
import br.com.fernandomoraes.financas.modelo.Movimentacao;
import br.com.fernandomoraes.financas.modelo.TipoMovimentacao;
import br.com.fernandomoraes.financas.util.JPAUtil;

public class TesteMovimentacaoComCategoria {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setId(1);
		
		Categoria categoria1 = new Categoria("Festas");
		Categoria categoria2 = new Categoria("Rateio de Custos");
		
		Movimentacao movimentacao1 = new Movimentacao();
		movimentacao1.setData(Calendar.getInstance());
		movimentacao1.setDescricao("Presente de Páscoa");
		movimentacao1.setValor(new BigDecimal("100.0"));
		movimentacao1.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		movimentacao1.setCategoria(Arrays.asList(categoria1));
		
		Movimentacao movimentacao2 = new Movimentacao();
		movimentacao2.setData(Calendar.getInstance());
		movimentacao2.setDescricao("Locação de mesas e cadeiras");
		movimentacao2.setValor(new BigDecimal("200.0"));
		movimentacao2.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		movimentacao2.setCategoria(Arrays.asList(categoria1 , categoria2));
		
		Movimentacao movimentacao3 = new Movimentacao();
		movimentacao3.setData(Calendar.getInstance());
		movimentacao3.setDescricao("Churrasco de Comemoração");
		movimentacao3.setValor(new BigDecimal("300.0"));
		movimentacao3.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		movimentacao3.setCategoria(Arrays.asList(categoria1 , categoria2));
		
		movimentacao1.setConta(conta);
		movimentacao2.setConta(conta);
		movimentacao3.setConta(conta);
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		em.persist(categoria1);
		em.persist(categoria2);
		em.persist(movimentacao1);
		em.persist(movimentacao2);
		em.persist(movimentacao3);
		
		em.getTransaction().commit();
		em.close();		
	}

}
