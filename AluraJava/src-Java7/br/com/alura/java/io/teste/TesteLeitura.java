/**
 * 
 */
package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author Cleiton
 * 
 */
public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		//fluxo de entrada com arquivo	
		InputStream fis = new FileInputStream("lorem.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		 while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		 }
		
		
		br.close();
		
	}

}
