/**
 * 
 */
package Funcoes;

/**
 * @author Cleiton
 *
 *2. Um bolo usa X ovos. Quantos bolos podem ser feitos com Y ovos?
 *Imagine que cada bolo utiliza 3 ovos e você terá 17 ovos para trabalhar. 
 */
public class Bolo_02 {
	public static void main (String []Args) {
		
		int totOvos, boloUnid, calculo;
		totOvos = 17;
		boloUnid = 3;
		
		calculo = totOvos / boloUnid;
				
		System.out.println("Podem ser feitos " +
		calculo +" bolos com o total de "+ totOvos + " ovos");	
	}

}
