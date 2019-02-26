package br.com.bytebank.banco.test;

public class TestaString {

	public static void main(String[] args) {
		
//		System
//		 - Classe ("S" maiusculo); Pacote java.lang; Visibilidade pública(public) , para que possa ser usado em qualquer lugar.
		
//		out
//		 - atributo da classe; Visibilidade público, para poder ser acessível fora da classe; Referência; Acesso static
//		
//		println
//		 - Mêtodo da classe; Visibilidade pública; Acesso não estático, pois se usa uma referência para chamar; 
//		 possui várias sobrecarga; Não usa exceçõe do tipo checked;
	
		String nome = "Mario";
		String outroNome = new String("Alura");
		
		String[] novo = nome.split("r");
//		String novo = nome.toLowerCase();
//		String novo = nome.toUpperCase();
//		String novo = outroNome.replace('A', 'a');
		
		for (int i = 0; i < novo.length; i++) {
			System.out.println(novo[i]);	
		}
		

	}

}
