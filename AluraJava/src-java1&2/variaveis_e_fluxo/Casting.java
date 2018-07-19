/**
 * 
 */
package variaveis_e_fluxo;

/**
 * @author Cleiton
 *
 */
public class Casting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//double d3 = 3.14;
		//int i = (int) d3;
					
		/*long x = 10000;
		int i = (int)x; // não compila, pois pode estar perdendo informação
		*/
		int i = 5;
		System.out.println(i);
		
		int x = ++i; // aqui x valera 6
		
		System.out.println( i +" double \n "
				+ "inteiro "+ x );
	}

}
