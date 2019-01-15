package PilhaExecucao;

import br.com.alura.Aluno;
import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaBuscaAlunoNoCursos {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes do Java",
                "Cleiton");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
        
        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);
        Aluno a4 = new Aluno("Paulo Silveira", 5617);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		System.out.println(javaColecoes.getAlunos());
		//javaColecoes.estaMatriculado(aluno);
	
		System.out.println("quem é o aluno com matricula 5617");
		Aluno aluno = javaColecoes.buscaMatriculado(5617);
		System.out.println("aluno : "+ aluno);
		
		
		
		
		
		
		
	}	
}
