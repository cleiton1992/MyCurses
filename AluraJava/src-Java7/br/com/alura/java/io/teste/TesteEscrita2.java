/**
 * 
 */
package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

/**
 * @author Cleiton
 * 
 */
public class TesteEscrita2 {

	public static void main(String[] args) throws IOException {
		
		//fluxo de saida com escrita em arquivo	
		//OutputStream fos = new FileOutputStream("lorem2.txt");
		//Writer osw = new OutputStreamWriter(fos);
		//BufferedWriter bw = new BufferedWriter(osw);
		
		
		/*
		FileWriter fw = new FileWriter("lorem2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
		 */
        
		//PrintWriter ps = new PrintWriter("lorem2.txt"); 
		
		PrintStream ps = new PrintStream(new File("PrintStream.txt"));
		ps.println("Print LN com a classse print Stream");
		ps.println();
		ps.println("dfsafdas dfs sdf asf assdﬂjjj");
		
		
		
		
        /*bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.newLine();
        bw.write("asfasdfsafdas dfs sdf asf assdﬂ");

        bw.close();*/
		
	}

}
