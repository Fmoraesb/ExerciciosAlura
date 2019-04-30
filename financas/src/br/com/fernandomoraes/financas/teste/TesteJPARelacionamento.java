package br.com.fernandomoraes.financas.teste;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.fernandomoraes.financas.modelo.Conta;
import br.com.fernandomoraes.financas.modelo.Movimentacao;
import br.com.fernandomoraes.financas.modelo.TipoMovimentacao;
import br.com.fernandomoraes.financas.util.JPAUtil;

public class TesteJPARelacionamento {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setAgencia("0102");
		conta.setNumero("13546");
		conta.setBanco("Itaú");
		conta.setTitular("Moleque");
		
		Movimentacao mov = new Movimentacao();
		mov.setData(Calendar.getInstance());
		mov.setDescricao("Churrascaria");
		mov.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		mov.setValor(new BigDecimal("200.0"));
		mov.setConta(conta);
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		em.persist(conta);
		em.persist(mov);
		
		em.getTransaction().commit();
		em.close();
	}

}
