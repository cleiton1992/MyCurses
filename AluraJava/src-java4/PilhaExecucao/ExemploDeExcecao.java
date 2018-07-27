package PilhaExecucao;

public class ExemploDeExcecao {

	public static void main(String[] args) {

		String var = "ABC2";

		try {

			Integer i = new Integer(var);

			System.out.println("A variável i vale " + i);

		} catch (NumberFormatException nfe) {

			System.out.println("Não é possível atribuir a string " + var);
			System.out.println(nfe.getCause()); //Pega a causa do problema



			}

		}

	}