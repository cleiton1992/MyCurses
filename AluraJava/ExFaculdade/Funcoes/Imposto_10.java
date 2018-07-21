/**
 * 
 */
package Funcoes;

/**
 * @author Cleiton
 *10. Um fabricante vendeu 120 unidades de um produto que custa R$ 40,00.
 *Sobre o valor vendido, o fabricante paga 40% de imposto.
 *Escreva um programa que calcule o valor de imposto a ser pago. 
 */
public class Imposto_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int qntd = 120;
		double unidades = 40;
		double imposto;
		double vendaBruta;
		vendaBruta = qntd * unidades;
		imposto = (vendaBruta*40 /100) ;
		
		System.out.println("o Valor da venda bruta é " + vendaBruta +" Reais");
		System.out.println("o Valor do imposto de 40% é " + imposto +" Reais");
		System.out.println("O valor da venda liquida é de " + (vendaBruta-imposto)+" Reais");
		
		
		

	}

}
