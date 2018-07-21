/**
 * 
 */
package Funcoes;

import java.util.Scanner;

/**
 * @author Cleiton
 *
 */
public class PesoFinal_13 {

	/**13. Uma pessoa obesa, pesando num certo momento 150kg,
	 * recolhe-se a um SPA onde se anunciam perdas de peso de até 2,5kg por semana.
	 * Supondo que isso realmente ocorra, escreva um programa que calcule e imprima na tela 
	 * o peso final que a pessoa deverá ter ao final de 20 semanas.
	 * (deverá aparecer: 100 quilos). 
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double pessoaPeso = entrada.nextDouble();	//150 kg	
		double pesoSemanal = entrada.nextDouble();	//2,5 kg
		int qntdSemanas = entrada.nextInt(); //20 semanas
		double calculo;
		double semanaSpa;
		
		semanaSpa = (pesoSemanal * qntdSemanas);
		calculo = pessoaPeso - semanaSpa;
		
		System.out.println("Em "+qntdSemanas +" semanas uma pessoa com "+pessoaPeso
				+" emagrecerá "+ semanaSpa+"Kilos e terá apenas "+calculo+"Kg");
	}

}
