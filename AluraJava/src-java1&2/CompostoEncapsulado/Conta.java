/**
 * 
 */
package CompostoEncapsulado;

/**
 * @author Cleiton
 * 
 */
public class Conta {
	private String opSucess = "Operação Realizada com sucesso! ";
	private String opFail = "Operação não realizada!";
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero){
		this.agencia = agencia;
	    this.numero = numero;
	    this.saldo = 100; //isso significa que toda conta começa com 100 de saldo.
	    total++;
	    
	    System.out.println("Criando uma conta");
	}
	
	public static int getTotal(){
	    return Conta.total;
	}

	public String getOpSucess() {
		return this.opSucess;
	}

	public String getOpFail() {
		return opFail;
	}

	public boolean deposita(double valor) {
    	if (valor > 0){
    		saldo  += valor;
    		return true;
    	}else {
    		return false;
    	} 
       }
    
    public boolean saca(double valor) { 
        if(this.saldo >= valor && valor>0) { 
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

    public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}

	/**
	 * @return the agencia
	 */
	protected int getAgencia() {
		return this.agencia;
	}

	/**
	 * @param agencia the agencia to set
	 */
	protected void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return the numero
	 */
	protected int getNumero() {
		return this.numero;
	}

	/**
	 * @param numero the numero to set
	 */
	protected void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the titular
	 */
	protected Cliente getTitular() {
		return this.titular;
	}

	/**
	 * @param titular the titular to set
	 */
	protected void setTitular(Cliente titular) {
		this.titular = titular;
	}















}
