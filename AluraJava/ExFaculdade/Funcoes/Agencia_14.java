/**
 * 
 */
package Funcoes;

import java.util.Scanner;

/**
 * @author Cleiton
 *
 */
public class Agencia_14 {

	/**
	 14. Precisamos alugar um carro por um único dia. Consultadas duas agências, 
	 a primeira cobra R$62,00 pela diária e R$1,40 por quilômetro rodado. 
	 A segunda cobra diária de R$80,00 e mais R$1,20 por quilômetro rodado. 
	 Sabendo que rodaremos 190 Km,
	  escreva um programa que calcule quanto pagaríamos em cada uma das agências
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double agDiaria1 = entrada.nextDouble(); //62,00
		double agDiaria2 = entrada.nextDouble(); //80,00
		double agKm1 = entrada.nextDouble(); //1,40
		double agKm2 = entrada.nextDouble(); //1,20
		int kmRodado =  entrada.nextInt(); //190
		double agTotal1, agTotal2;
		
		agTotal1 = agDiaria1+(agKm1*kmRodado);
		agTotal2 = agDiaria2+(agKm2*kmRodado);
		
		System.out.println("O total da agencia 1 custa R$"+agTotal1);
		System.out.println("O total da agencia 2 custa R$"+agTotal2);
		
		if (agTotal1 < agTotal2) {
			System.out.println("A agencia 1 é mais barata "+agTotal1);
		} else if (agTotal1 > agTotal2) {
			System.out.println("A agencia 2 é mais barata "+agTotal2);
		}
	}

}
