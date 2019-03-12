package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String caracter = "�";
		System.out.println(caracter.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.toString());
//		System.out.println(charset.displayName());
//		System.out.println(charset.name());   // Qualquer uma dessas serve, j� que todas imprimem o nome do Charset padr�o do sistema
		
		byte[] byteDoCaracter = caracter.getBytes("windows-1252");
		System.out.println(byteDoCaracter.length + ", Windows-1252");
		String novoCharset = new String(byteDoCaracter, "windows-1252");
		System.out.println(novoCharset);
	
		byteDoCaracter = caracter.getBytes("UTF-16");
		System.out.println(byteDoCaracter.length + ", UTF-16");
//		novoCharset = new String(byteDoCaracter, "windows-1252"); // Aqui d� problema! Imprime "�� �"
		novoCharset = new String(byteDoCaracter, "UTF-16");
		System.out.println(novoCharset); 
		
		byteDoCaracter = caracter.getBytes(StandardCharsets.US_ASCII);
		System.out.println(byteDoCaracter.length + ", US_ASCII");
//		novoCharset = new String(byteDoCaracter, "windows-1252"); // Aqui, como � um caractere especifico do Latim, imprime "?" 
		novoCharset = new String(byteDoCaracter, StandardCharsets.US_ASCII);
		System.out.println(novoCharset);
	}

}
