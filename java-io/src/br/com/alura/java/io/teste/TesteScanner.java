package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) throws FileNotFoundException {
	
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numeroConta = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldoConta = linhaScanner.nextDouble();
			
			System.out.format("%s - %04d-08%d %s : %08.2f %n", 
					tipoConta, agencia, numeroConta, titular, saldoConta);
			
			linhaScanner.close();
			
			
//			String[] valores = linha.split(","); // Essa "," serve como um caracter de defini��o do que deve ser usado como separador.
//			System.out.println(Arrays.toString(valores));// Aqui, como o pr�prio m�todo diz, ele pega a informa��o e transforma numa String, 
//														// inteligivel para pessoas.
//			System.out.println(valores[3]);// Aqui ele usa um wrapper para imprimir a informa��o que se encontra na posi��o 3 do Array valores.
		}
		scanner.close();
	}

}
