/**
 * 
 */
package Lista1;

/** LISTA 2
 * @author Cleiton
 *
 */
public class Exercicio1 {

	public static void main(String[] args) {
		
		String[]semana = {"segunda", "terça", "quarta", "quinta", "sexta", "sabado", "domingo"};
		int[] qntPessoas= {1897, 4173, 2175, 3746, 4173, 5393, 5632};
		
		int posicao = 0;
		int proximo = 0;
		//A -)
		while(proximo< qntPessoas.length){
			if(qntPessoas[posicao]<qntPessoas[proximo]) {
				posicao = proximo;
			}
			proximo++;
			
		}
		System.out.println("o dia com mais pessoas é "+ semana[posicao] +" "+ qntPessoas[posicao]);

		//B-)
		int soma = 0;
			for(int i=0; i<semana.length; i++) {
				soma = soma + qntPessoas[i];
			}
			System.out.println("resultado da soma é "+soma);
		
		//C-) 
			int difSabadoDomingo;
			if(qntPessoas[5]< qntPessoas[6]) {
				difSabadoDomingo = qntPessoas[6]-qntPessoas[5];		
			System.out.println("No "+semana[6]+" foram "+difSabadoDomingo+" pessoas a mais do que no "+semana[5]);
			}else {
				difSabadoDomingo = qntPessoas[5]-qntPessoas[6];
				System.out.println("No "+semana[5]+" foram "+difSabadoDomingo+" pessoas a mais do que no "+semana[6]);	
			}
	
				
		
		
	}		

}