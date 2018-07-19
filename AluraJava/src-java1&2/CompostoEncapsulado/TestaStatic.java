/**
 * 
 */
package CompostoEncapsulado;

/**
 * @author Cleiton
 *
 */
public class TestaStatic {
	public static void main(String args[]){
	   
		Conta conta = new Conta(123,456);
		Conta conta1 = new Conta(123,456);
	    System.out.println(Conta.getTotal());

}
}