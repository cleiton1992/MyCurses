package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Collection<String> alunos = new HashSet<>();	
	    alunos.add("Rodrigo Turini");
	    alunos.add("Alberto Souza");
	    alunos.add("Nico Steppat");
	    alunos.add("Sergio Lopes");
	    alunos.add("Renan Saggio");
	    alunos.add("Mauricio Aniche");
	    alunos.add("Nico Steppat");
	    
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
		
		
		System.out.println(alunos.size());
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		System.out.println("---------------");
		

		
		

	}

}
