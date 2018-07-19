/**
 * 
 */
package herançaEUsodeConstrutores;

/**
 * @author Cleiton
 *
 */
public class ContaCorrente extends Conta {

	/**
	 * @param agencia
	 * @param numero
	 */
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override
	public boolean saca(double valor) {
		double valorSacar = valor + 0.2;
		return super.saca(valorSacar);
	}

}
