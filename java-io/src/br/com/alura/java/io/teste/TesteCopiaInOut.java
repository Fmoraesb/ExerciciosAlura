package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TesteCopiaInOut {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("lorem.txt."); // "System.in" caso queria usar o teclado (Input padrão do sistema)!
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		FileOutputStream fos = new FileOutputStream("loremEscrita.txt."); // "System.out" caso queria que aparece no console (Output padrão do sistema)
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while (linha != null && !linha.isEmpty()) { // Para que funcione com o teclado, ele precisa saber que não pode receber um input vazio,
			                                       // já que não temos como imitar um null pelo teclado.
			
			bw.write(linha);
			bw.flush();
			bw.newLine();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
	}

}
