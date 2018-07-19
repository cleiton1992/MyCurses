/**
 * 
 */
package vetores;

import java.util.Scanner;

import javax.xml.namespace.QName;

/**
 * @author Cleiton
 *
 */
public class lista01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] semana = {"Segunda","Terca","Quarta","Quinta","Sexta","Sabado","Domingo"};
		Scanner entrada = new Scanner(System.in);
		int qtdeSemanas = semana.length;
		int[] qtdePessoas = new int[qtdeSemanas];
	
		int auxMaior =0;
		int somaVisitantes = 0;
		int auxContador = 0;
		int auxMenor = 0;
		int sabDomingo = 0;
		
		for(int i=0; i<qtdeSemanas; i++) {
			System.out.println("Quantos visitantes na " + semana[i]+"?");
			
			qtdePessoas[i] = entrada.nextInt();
			
			System.out.println("valorde i é :"+ i);
			
			
			if(	qtdePessoas[auxMaior]<qtdePessoas[i]) {
				auxMaior=i;
				
				System.out.println("MAIS VISITANTES "+ semana[i]+" "
						+ "qntidade digitada é "+ qtdePessoas[i]);	
			}
			
            /*
            Exercicio F  - menos visitantes                      
            */
             if(qtdePessoas[auxMaior] > qtdePessoas[i]){
            	 auxMenor = i;
            	 
            	 System.out.println("MENOS VISITANTES "+ semana[i]+" "
 						+ "qntidade digitada é "+ qtdePessoas[i]);	
            }
            

// soma 
			 somaVisitantes += qtdePessoas[i];
			 
           if(i > 5) {
        	  
			System.out.println("somaVisitantes========= "+somaVisitantes);
			}
           
           
           if(qtdePessoas[5]>qtdePessoas[6]){
        	   sabDomingo = qtdePessoas[5]-qtdePessoas[6];
        	   System.out.println("sabado foram um total de "+sabDomingo+" a mais que no domingo");
           }
           
           
           
           
		}//FOR
		
		
	}

}
