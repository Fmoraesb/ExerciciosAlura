package br.com.bytebank.banco.test;

public class TestaString {

	public static void main(String[] args) {
		
//		System
//		 - Classe ("S" maiusculo); Pacote java.lang; Visibilidade p�blica(public) , para que possa ser usado em qualquer lugar.
		
//		out
//		 - atributo da classe; Visibilidade p�blico, para poder ser acess�vel fora da classe; Refer�ncia; Acesso static
//		
//		println
//		 - M�todo da classe; Visibilidade p�blica; Acesso n�o est�tico, pois se usa uma refer�ncia para chamar; 
//		 possui v�rias sobrecarga; N�o usa exce��e do tipo checked;
	
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
