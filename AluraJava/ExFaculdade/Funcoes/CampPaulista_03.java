/**
 * 
 */
package Funcoes;

/**
 * @author Cleiton
 *
 *3.  Quantos pontos tem um time que venceu X jogos e empatou Y no Campeonato Paulista?
 *Imagine que o time ganhou 4 jogos e empatou 3. 
 */
public class CampPaulista_03 {
	public static void main(String []Args) {
		int vitoria, empate;
		int time;
		 vitoria = 3; empate = 1;
		 
		time = vitoria*4 + empate*3;
		
		System.out.println("O time que ganhou 4 jogos e empatou 3 tem " +time+ " pontos.");
	}

}
