/**
 * 
 */
package Funcoes;

/**
 * @author Cleiton
 *
 *5.  Resolva a equação: N1 + N2 x N3 / (N4 – N5) 
 *Assuma como entradas N1= 5, N2=2, N3=8, N4=7 e N5=4. 
 */
public class Equacao_05 {
	public static void main (String [] Args) {
		int N1= 5, N2=2, N3=8, N4=7, N5=4;
		int equac;
		
		equac = N1 + N2 * N3 / (N4 - N5);
		
		System.out.println("O resultado da equação é: "+equac);
	}

}
