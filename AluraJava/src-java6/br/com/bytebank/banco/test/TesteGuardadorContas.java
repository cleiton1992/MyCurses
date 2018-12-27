package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorContas {
	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc1 = new ContaCorrente(22, 11);
        guardador.adiciona(cc1);

        Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);
        
        Conta cp = new ContaCorrente(22, 22);
        guardador.adiciona(cp);
        
        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println("o tamanho do array é " + tamanho);
        
        Conta ref = (Conta)guardador.getReferencia(1); //cast em (Conta) para transformar em referencia especifica
        System.out.println(ref.getNumero());

        
	
	}
}
