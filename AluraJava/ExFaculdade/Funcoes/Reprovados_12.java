/**
 * 
 */
package Funcoes;

import java.util.Scanner;
/**
 * @author Cleiton
 *
 */
public class Reprovados_12 {
	/**
	 * 12. Em uma disciplina estavam matriculados 82 alunos. Deste total, 30 alunos foram reprovados.
	 * Escreva um programa que calcule e imprima na tela a porcentagem de alunos reprovados.
	 * (deverá aparecer 36.58%). 
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int alunos = entrada.nextInt();
		int reprovados = entrada.nextInt();
		double reprovadosPerc;
		
		reprovadosPerc =  reprovados* 100. /alunos;
		
		System.out.println(reprovadosPerc);
	}

}
