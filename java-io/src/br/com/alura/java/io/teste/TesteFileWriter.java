package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteFileWriter {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		
		//bw.newLine(); FileWriter não possui esse método, (só está funcionando por ser um Buffered), então é previso usar outro modo
		bw.write(System.lineSeparator()); // Devolve o criador de separador de linha de acordo com o 
		//sistema (MicrosoftWindows systems it returns "\r\n".)
		
		bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,");
		
		
		bw.close();
	}

}
