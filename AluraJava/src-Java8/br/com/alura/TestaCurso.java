package br.com.alura;

import java.util.List;

public class TestaCurso {
	public static void main(String[] args) {
		Curso JavaColecoes = new Curso("Dominando as Coleçoes do Java", "cleiton");
		//JavaColecoes.getAulas().add(new Aula("trabalhando com ArrayList", 22));
		JavaColecoes.adiciona(new Aula("trabalhando com ArrayList", 22));
		
		List<Aula> aulas = JavaColecoes.getAulas();
		System.out.println(aulas);

		aulas.add(new Aula("trabalhando com ArrayList", 21));

		System.out.println(aulas);
		
		System.out.println(JavaColecoes.getAulas());
		System.out.println(aulas == JavaColecoes.getAulas());

	}
}
