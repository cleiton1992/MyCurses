/**
 * 
 */
package Lista1;
import java.util.Scanner;

	/**
	 * @author Cleiton
	 *
	 */

	public class Exercicio2 {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			String[] semana = {"segunda", "terça", "quarta", "quinta", "sexta", "sabado", "domingo"};
			
			int qntsemana = semana.length;
			
			Scanner entrada = new Scanner(System.in);
			int posicao = 0;
			int proximo = 1;
			
			int tamanho = semana.length;
			int[] evento = new int[tamanho]; 
		
			for(int i=0; i<tamanho; i++) {
				System.out.print("Quantidade de visitantes existem na "+semana[i] +"  ");
				evento[i] = entrada.nextInt();
				
				//System.out.println(evento[2]);
				
				if(evento[posicao] < evento[i]) {
					
					posicao = evento[i];
					System.out.println("essa é posiçao no if :"+posicao);
					
				}
			/**
			System.out.println("Relatório de Visitantes");
			for (int i = 0; i <semana.length; i++) {
				System.out.println(semana[i]+"\t"+evento[i]);
			}
			 */	
			

		}
	}
}


