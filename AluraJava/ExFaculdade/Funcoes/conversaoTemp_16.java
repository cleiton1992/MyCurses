/**
 * 
 */
package Funcoes;

import java.util.Scanner;

/**
 * @author Cleiton
 *
 */
public class conversaoTemp_16 {

	/**
	 *16. Fazer um programa que leia uma temperatura fornecida em graus Farenheit
	 * e a converta para o seu equivalente em graus centígrados,
	 * imprimindo este valor na tela. Dado C=(5/9)(F-32)
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite a temperatura em Farenheit:");
		int temp = entrada.nextInt();
		
		double conversao = ((double)5/9 * (temp - 32) );
		System.out.println("A temperatura convertida de "+temp+" graus Farenheit é "+conversao);
	}

}
