/**
 * 
 */
package Funcoes;

/**
 * @author Cleiton
 *4.  Um banho de 15 minutos gasta 135 litros de água.
 *Quanto economiza de água um banho de X minutos?
 *Imagine um banho de 5 minutos.
 */
public class Banho_04 {
	public static void main (String []Args) {
		int banho = 135;
		int banhoEcono;
		int banhoMin; 
		banhoMin = banho/3;
		
		banhoEcono = banho - banho/3;
		
		System.out.println("Um banho de 5 minutos economiza "+ banhoEcono +" litros de água a mneos em relação a um banho de 15 minutos.");
		System.out.println(banhoMin);
		
		
		
		
		
	}

}
