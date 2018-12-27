package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {
	
	private Object[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeReferencias() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Object ref) {
		this.referencias[this.posicaoLivre] = ref; 	//pega a posição que esta livre e coloca dentro do array referencias[]
		this.posicaoLivre ++;	//contador. acrescenta mais 1 a variavel auxiliar para que na proxima execução tenha um valor livre
	
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;			//retorna o valor da variavel livre
	}

	public Object getReferencia(int pos) {
	return this.referencias[pos];	
	
	}
	
	
	
	
	

}
