/**
 * 
 */
package Funcoes;

import java.util.Scanner;

/**
 * @author Cleiton
 *
 */
public class AlturaTrapezio_17 {

	/**
	 *17. Escreva um programa que leia os valores da base maior (B),
	 * base menor (b) e altura (h) de um trapézio,
	 * e calcule e imprima o valor de sua área,
	 * sabendo que a área de um trapézio (A) é dada por: A= ((B+b)h)/2
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor da base menor b");
		double baseMenor = entrada.nextDouble(); // b
		System.out.println("Digite o valor da base maior B ");
		double baseMaior = entrada.nextDouble(); // B
		System.out.println("Digite o valor da altura ");
		double altura = entrada.nextDouble(); // altura h
	
		double area;
		
		area = (baseMaior+baseMenor)*altura /2;
		System.out.println("O valor da area é "+area);

	}

}
