package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

	private Object[] referencias;
	private int posLivre;

	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posLivre = 0;
	}

	public void adiciona(Conta referencia) {
		this.referencias[posLivre] = referencia;
		this.posLivre++;
	}

	public void adiciona(Object referencia) {
		this.referencias[posLivre] = referencia;
		this.posLivre++;
	}
	
	public int getQuantidadeElementos() {
		return this.posLivre;
	}

	public Conta getContaReferencia(int posicao) {
		Conta ref = (Conta) this.referencias[posicao];
		return ref;
	}
	
	public Object getReferencia(int posicao) {
		Object ref = this.referencias[posicao];
		return ref;
	}
	
}
