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
import java.io.Writer;

/**
 * @author Cleiton
 * 
 */
public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		//fluxo de saida com escrita em arquivo	
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Loremkl ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmoddf");
		bw.newLine();
		bw.newLine();
		bw.write("sdfsdfsdfd sdf sdf sd sdmjhkjkkf");
		
		bw.close();
		
	}

}
