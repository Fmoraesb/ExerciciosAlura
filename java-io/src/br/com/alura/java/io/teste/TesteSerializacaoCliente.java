package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

//		Cliente cliente = new Cliente();
//		cliente.setNome("Klaus Augusto");
//		cliente.setCpf("111234523");
//		cliente.setProfissao("Dono do Mundo");
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close(); // Essa é a forma de criar um arquivo com um Objeto
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cliente.getNome()); // E essa é a forma de ler esse mesmo arquivo!

		
//		String nome = "Klaus Augusto";
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oos.writeObject(nome);
//		oos.close(); // Essa é a forma de criar um arquivo usando um Objeto
		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
//		String nome = (String) ois.readObject();
//		ois.close();
//		System.out.println(nome); // E essa é a forma de ler esse mesmo arquivo!
	}

}
