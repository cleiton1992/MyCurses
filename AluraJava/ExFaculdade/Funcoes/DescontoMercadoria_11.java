/**
 * 
 */
package Funcoes;

import java.util.Scanner;

/**
 * @author Cleiton
 *
 */
public class DescontoMercadoria_11 {
	/**
	 * @param args
	 * 11. Escreva um programa que calcule o valor do desconto de uma mercadoria paga a vista e o valor total a ser pago.
	 * Considere o valor da mercadoria como sendo R$ 330,00 e a porcentagem do desconto 5%.
	 * (Deverá aparecer para o desconto 16.5 e para o valor a ser pago 313.5)
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double mercadoria = entrada.nextDouble();
		int percentual = entrada.nextInt();
		double desconto;
		
		desconto = ( percentual * mercadoria/100);		
		System.out.println("Valor da mercadoria a vista é R$" + mercadoria + "\nO valor do desconto é de R$"
		+ desconto + " , o percentual é de "+ percentual + "%");
		
		System.out.println("O valor a para pagar é de R$" + (mercadoria - desconto));
		}
}
