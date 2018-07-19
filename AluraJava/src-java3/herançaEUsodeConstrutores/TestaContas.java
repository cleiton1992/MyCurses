/**
 * 
 */
package herançaEUsodeConstrutores;

/**
 * @author Cleiton
 *
 */
public class TestaContas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0);
        
        cc.transfere(10.0, cp);
        
        System.out.println("CC: "+cc.getSaldo());
        System.out.println("CP: "+cp.getSaldo());

	}

}
