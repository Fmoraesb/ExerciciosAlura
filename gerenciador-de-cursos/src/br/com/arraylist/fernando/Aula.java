package br.com.arraylist.fernando;

public class Aula implements Comparable<Aula>{

	private String nomeDaAula;
	private int tempoDeAula;
	
	public Aula(String nome, int tempo) {
		this.nomeDaAula = nome;
		this.tempoDeAula = tempo;
	}
	
	public String getNomeDaAula() {
		return nomeDaAula;
	}
		
	public int getTempoDeAula() {
		return tempoDeAula;
	}

	@Override
	public String toString() {
		return "[Aula: " + this.getNomeDaAula() + ", " + this.getTempoDeAula() + " minutos]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.nomeDaAula.compareTo(outraAula.getNomeDaAula());
	}
}
