/**
 * 
 */
package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * @author Cleiton
 * 
 */
public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
		/*
		 * //fluxo de entrada com arquivo	
		*InputStream fis = new FileInputStream("lorem.txt");
		*InputStreamReader isr = new InputStreamReader(fis);
		*/
		
		InputStream fis = System.in; //entrada com o teclado
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		//fluxo de saida com escrita em arquivo	
		//OutputStream fos = new FileOutputStream("lorem2.txt");
		
	  
		OutputStream fos = System.out;
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
				
				
	br.close();	
	bw.close();

	}

}
