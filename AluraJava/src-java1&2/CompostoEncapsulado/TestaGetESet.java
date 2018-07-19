/**
 * 
 */
package CompostoEncapsulado;

/**
 * @author Cleiton
 *
 */
public class TestaGetESet { 
   
	static int numero = 111;
	static int agencia = 222;

	public static void main(String[] args) { 
        Conta conta = new Conta(agencia, numero);

        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        
        paulo.setNome("Paulo Silveira");
        conta.setTitular(paulo);
        
        conta.getTitular().setProfissao("programador");
        
        System.out.println(conta.getTitular().getNome());
        
        System.out.println(conta.getTitular().getProfissao());
        
        
       System.out.println(conta.getOpSucess());
       System.out.println(conta.getOpFail()); 
        
        
        
        
    }

	
}