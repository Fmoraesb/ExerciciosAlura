package br.com.bytebank.banco.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		Cliente cliente = new Cliente();
		cliente.setNome("Klaus Augusto");
		cliente.setCpf("12343267890");
		cliente.setProfissao("Dono do Mundo(Gracinha e Fofinho também!");
		
		ContaCorrente cc = new ContaCorrente(7333, 20999);
		cc.setTitular(cliente);
		cc.deposita(20000.0);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();

	}

}
