/**
 * 
 */
package CompostoEncapsulado;

import java.util.Scanner;

/**
 * @author Cleiton
 *
 */
public class TestaMetodo {
	public static void main(String[] args) {
		int numero = 111;
		int agencia = 222;
	
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		Scanner entrada3 = new Scanner(System.in);
		
		
		System.out.print("Digite o valor a ser retirado: ");
		double valSaque = entrada1.nextDouble();
				
		System.out.print("Digite o valor a ser Depositado: ");
		double valDeposito = entrada2.nextDouble();
		
		Conta contaDoPaulo = new Conta(agencia, numero);
	    contaDoPaulo.setSaldo(0);
	    
	    if(contaDoPaulo.deposita(valDeposito)){
	    	System.out.println(contaDoPaulo.getOpSucess()+ "O valor depositado foi de "+valDeposito);
	    	System.out.println("atualmente o saldo é "+contaDoPaulo.getSaldo());
	    	}else {
	    		System.out.print(contaDoPaulo.getOpFail() +"\nMotivo: O Valor não pode ser negativo!!");
	    	}
	    
        if( contaDoPaulo.saca(valSaque)) {
        	System.out.println(contaDoPaulo.getOpSucess());
        	System.out.println("Saldo atual da Conta após o saque de "+valSaque+" é " +contaDoPaulo.getSaldo()); 	
        }else {
        	System.out.println(contaDoPaulo.getOpFail() +"\nSaldo Insuficiente! ");
        }
       	    System.out.println(contaDoPaulo.getSaldo());
	    
       Conta contaMarcela = new Conta(agencia, numero);
        contaMarcela .deposita(100);
        
		System.out.print("Digite o valor a que será transferido: ");
		double valTransf = entrada3.nextDouble();
		
        if(contaMarcela.transfere(valTransf, contaDoPaulo)) {
        	System.out.println(contaMarcela.getOpSucess());
        }else {
        	System.out.println(contaMarcela.getOpFail());
        }
        
        System.out.println(contaMarcela.getSaldo());
        System.out.println(contaDoPaulo.getSaldo());
	 }
}
