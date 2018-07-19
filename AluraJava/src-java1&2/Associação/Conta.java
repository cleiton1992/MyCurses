/**
 * 
 */
package Associação;

/**
 * @author Cleiton
 *
 */
public class Conta {
	double saldo;
    int agencia;
    int numero;
    Cliente titular;
    
    public boolean deposita(double valor) {
    	if (valor > 0){
    		saldo  += valor;
    		return true;
    	}else {
    		return false;
    	} 
       }
    
    public boolean saca(double valor) { 
        if(this.saldo >= valor) { 
            this.saldo -= valor; 
            return true;
        } else {
            return false;
            }
    }
    
    public boolean transfere(double valorTransf, Conta contaDestinho) {
    	if (this.saldo >= valorTransf) {
    		this.saldo -= valorTransf; 
    		// guarda resultado do calculo de saldo menos o valor de transferencia
    		contaDestinho.deposita(valorTransf); 
    		//coloca valor na conta de destino usando o metodo de deposito
    		return true;
    	} 
    	return false;    	
    }
    

}
