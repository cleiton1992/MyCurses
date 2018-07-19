package variaveis_e_fluxo;

/*Imprima o resultado do somatório de 1 até 1000 
(inclusive). Para isso você deve utilizar alguma variável extra que armazena
a soma temporária e aumentá-la a cada novo passo. Compartilhe sua solução.*/

//Exercicio 04 variaveis de fluxo

public class somatorio1a100 {
	
	public static void main(String [] args) {
		int i = 0;
		int valor = 0;
		
		while (i <=1000) {
			System.out.println(valor);
			valor= valor+ 1;
			i++;
			}
	}

}
