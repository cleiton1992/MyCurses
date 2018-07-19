/**
 * 
 */
package objetos;

import java.util.Scanner;

/**
 * @author Cleiton
 *
 */
public class TestaMetodo {
	public static void main(String[] args) {
		String opSucess = "Operação Realizada com sucesso! ";
		String opFail = "Operação não realizada!";
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("Digite o valor a ser retirado: ");
		double valSaque = entrada1.nextDouble();

		
		Scanner entrada2 = new Scanner(System.in);
		System.out.print("Digite o valor a ser Depositado: ");
		double valDeposito = entrada2.nextDouble();
		
		Scanner entrada3 = new Scanner(System.in);
	
		Conta contaDoPaulo = new Conta();
	    contaDoPaulo.saldo = 0;
	    
	    if(contaDoPaulo.deposita(valDeposito)){
	    	System.out.println(opSucess+ "O valor depositado foi de "+valDeposito);
	    	System.out.println("atualmente o saldo é "+contaDoPaulo.saldo);
	    	}else {
	    		System.out.print(opFail +"\nMotivo: O Valor não pode ser negativo!!");
	    	}

	 // boolean conseguiuRetirar = contaDoPaulo.saca(20);
        if( contaDoPaulo.saca(valSaque)) {
        	System.out.println(opSucess);
        	System.out.println("Saldo atual da Conta após o saque de "+valSaque+" é " +contaDoPaulo.saldo); 	
        }else {
        	System.out.println(opFail +"\nSaldo Insuficiente! ");
        }
       	    
	    
        Conta contaMarcela = new Conta();
        contaMarcela .deposita(1000);
        
		System.out.print("Digite o valor a que será transferido: ");
		double valTransf = entrada3.nextDouble();
		
        if(contaMarcela.transfere(valTransf, contaDoPaulo)) {
        	System.out.println(opSucess);
        }else {
        	System.out.println(opFail);
        }
        
        System.out.println(contaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);
	  }
}
