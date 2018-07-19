package variaveis_e_fluxo;

/*
 * Utilizando um laço do tipo for imprima todos os múltiplos de 3, entre 1 e 100.
 * Existem duas maneiras tradicionais de resolver este problema.
 */

public class multiplosdex {
	
	public static void main(String [] args) {
			int i;
		
		for (i=0; i<100; i++) {
			if(i %3 == 0 ) {
								
			System.out.println( i+ " é multiplo de Três" );
			}else {
				System.out.println( i+ " não é multiplo de Três" );
			}		
		}		
			/* 
			 * Outra Maneira
			for (i = 3; i < 100; i += 3 ){
	            System.out.println(i);
	        }	
			*/
	}

}
