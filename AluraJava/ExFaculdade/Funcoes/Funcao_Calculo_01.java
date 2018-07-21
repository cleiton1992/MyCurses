/**
 * 
 */
package Funcoes;

/**
 * @author Cleiton
 *1. Dado o cálculo 12 * 3 + 4 - 8 / 2 % 3, qual o resultado?
 */
public class Funcao_Calculo_01 {
	
	public static void main (String [] Args) {
		int calc = (12 * 3) + 4-((8 / 2)*(3/100));
		System.out.println("O resultado é " + calc);
		/*if (calc %3 == 0) {
			System.out.println("O resultado é " + calc);
			}*/
	}
}
