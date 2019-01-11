package br.com.bytebank.banco.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.alura.java.io.teste.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	private static Cliente titular;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Cliente cliente = new Cliente();
		cliente.setNome("Cleiton");
		cliente.setProfissao("Engenheiro da Computação");
		cliente.setCpf("41824152999");
		
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(222.3);
		//cc.setTitular(cliente);
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cliente);
		oos.close();
		
		
		
		
		
	}

}
