/**
 * 
 */
package Funcoes;

import java.util.Scanner;

/**
 * @author Cleiton
 *
 */
public class PessoaPorMetro_15 {

	/**
	 15. Alguns jornais calculam o número de pessoas presentes em atos públicos,
	  considerando que cada metro quadrado é ocupado por 4 pessoas. 
	  Escreva um programa que calcule qual a estimativa do número de 
	  pessoas presentes numa praça de 3250m2,
	  que tenha ficado lotada para um comício, segundo essa avaliação.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int qntdPessoa = entrada.nextInt();
		int metros = entrada.nextInt();
		int pessoaMetro;
		
		pessoaMetro = qntdPessoa * metros;
		
		
		System.out.println(pessoaMetro+ " pessoas por metro");
		

	}

}
