/**
 * 
 */
package Funcoes;
import java.util.Scanner;
/**
 * @author Cleiton
 *9. Uma empresa pretende diminuir a diferença entre o salário de seus funcionários
 * e decidiu dar aumentos  proporcionais da seguinte forma:
 *  salário bruto R$500.00 :    	Aumento de 15% 
    salário bruto  R$900.00 :   	Aumento de 10%   
	salário bruto R$1500.00:    	Aumento de 5%  
 */
public class AumentoSalarial_09 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double salario = entrada.nextDouble();
		double aumento;

		if (salario <= 500) {
			aumento = 15;			
		
		}else if(salario > 500 && salario <= 900) {
			aumento = 10;
			
		}else {
			aumento = 5;
			
		}
		double aumentoSalarial= salario * aumento/100;
		double novoSalario= salario+ aumentoSalarial;
		
		System.out.println(salario + "->" + novoSalario);
	}

}
