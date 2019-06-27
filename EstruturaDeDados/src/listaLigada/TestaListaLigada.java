package listaLigada;

public class TestaListaLigada {

	public static void main(String[] args) {

		ListaLigada lista = new ListaLigada();

		System.out.println(lista);
		lista.adicionaNoComeco("Isabela");
		System.out.println(lista);
		lista.adicionaNoComeco("Klaus");
		System.out.println(lista);		
		lista.adicionaNoComeco("Fernando");
		System.out.println(lista);
		
		lista.adiciona("Lady");
		System.out.println(lista);
		
	    lista.adiciona(2, "Moleque");
		System.out.println(lista);
		System.out.println(lista.tamanho());
		
		lista.removeDoComeco();
		System.out.println(lista);
		System.out.println(lista.tamanho());
		
		lista.removeDoFim();
		System.out.println(lista);
		System.out.println(lista.tamanho());
		
		lista.remove(1);
		System.out.println(lista);
		System.out.println(lista.tamanho());
		
		System.out.println(lista.contem("Isabela"));
		System.out.println(lista.contem("Fernando"));
		
		
	}	
}
