package listaLigada;

public class Celula {
	
	private Object elemento;
	private Celula anterior; // Para criar uma lista duplamente encadeada, tudo que é preciso é ter um index para o elemento anterior
	private Celula proxima;

	public Celula (Object elemento) {
		this(elemento, null);
	}
	
	public Celula(Object elemento, Celula proxima) {
		this.elemento = elemento;
		this.proxima = proxima;
	}

	public Celula getProxima() {
		return proxima;
	}
	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	public Object getElemento() {
		return elemento;
	}
	

	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	
	
}
