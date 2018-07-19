/**
 * 
 */
package variaveis_e_fluxo;

/**
 * @author Cleiton
 *
 */
public class Exercicio8 {

	/** Escreva um programa que, dada uma variável x com algum valor inteiro,
	 *(por exemplo 13), temos um novo x de acordo com a seguinte regra:
			se x é par, x = x / 2
			se x é ímpar, x = 3 * x + 1
			imprime x
			o programa deve parar quando x == 1
			Por exemplo, para x = 13 a saída deve ser:

13 > 40 > 20 > 10 > 5 > 16 > 8 > 4 > 2 > 1
	 */
	public static void main(String[] args) {
		/*double x;
		
		for (x=0; x<=100; x++) {
			if (x == (int)x/2) {
					System.out.println("x == x/2 = "+ x );
			}else {
				x = 3 * x + 1;
				System.out.println(" x = 3 * x + 1 = "+x);
			}
			
		}
		
		
	}*/

	
	//class TresNMaisUm {
    //public static void main(String[] args) {
        int x = 13;
        System.out.println("Iniciando...\n");
        while (x != 1) {
            System.out.print(x + " > ");
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x =(( 3 * x) + 1);
            }
        }
        System.out.print(x);
    }

	 
	
	
}
