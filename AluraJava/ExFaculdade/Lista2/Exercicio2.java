package Lista2;

import java.util.Scanner;

public class Exercicio2 {
	 public static void main(String[] args){
	        
	        int qtdeFaltaAlunoA, diferencaAB, somaCD, qtdeMaisAlunoE;
	        
	        String[] escolas = {"A","B","C","D","E"};
	        Scanner entrada = new Scanner(System.in);
	        int qtdeEscolas = escolas.length;
	        int[] qtdeAlunos = new int[qtdeEscolas];
	                
	        int maisAlunos = 0;
	        int menosAlunos = 0;
	        int alunosA = 0;
	        int alunosB = 0;
	        int alunosC = 0;
	        int alunosD = 0;
	        int alunosE = 0;
	       
	        
	        for(int i=0; i<qtdeEscolas; i++){
	            System.out.println("Quantos alunos na " +escolas[i]+"?");
	            qtdeAlunos[i] = entrada.nextInt();
	            
	            /*
	            Exercicio A            
	            */            
	            if(qtdeAlunos[maisAlunos] < qtdeAlunos[i]){
	                maisAlunos = i;
	            }
	            /*
	            Exercicio B           
	            */                  
	            else if(qtdeAlunos[menosAlunos] > qtdeAlunos[i]){
	                menosAlunos = i;                
	            }            
	            
	            if(null != escolas[i])switch (escolas[i]){
	                case "A":
	                    alunosA = qtdeAlunos[i];
	                    break;
	                case "B":
	                    alunosB = qtdeAlunos[i];
	                    break;
	                case "C":
	                    alunosC = qtdeAlunos[i];
	                    break;
	                case "D":
	                    alunosD = qtdeAlunos[i];
	                    break;
	                case "E":
	                    alunosE = qtdeAlunos[i];
	                    break;
	            }
	        }
	        
	        System.out.println("A) Escola " + escolas[maisAlunos] + " tem mais alunos");
	        System.out.println("B) Escola " + escolas[menosAlunos] + " tem menos alunos");
	        
	        
	            /*
	            Exercicio C                        
	            */
	        if(alunosA < alunosE){
	            qtdeFaltaAlunoA = (alunosE - alunosA);
	            System.out.println("C) Faltam " + qtdeFaltaAlunoA + " alunos.");            
	        } else {
	            System.out.println("C) Existem mais alunos na Escola A");
	        }   
	        
	            /*
	            Exercicio D                      
	            */
	        if(alunosA < alunosB){
	            diferencaAB = (alunosB - alunosA);
	            System.out.println("D) Diferença de " + diferencaAB + " alunos.");            
	        } else {
	            diferencaAB = (alunosA - alunosB);
	            System.out.println("D) Diferença de " + diferencaAB + " alunos.");
	        }
	        
	             /*
	            Exercicio E                      
	            */
	        somaCD = (alunosC + alunosD);
	        System.out.println("E) Na escola C e D tem " + somaCD + " alunos."); 
	        
	        
	           /*
	            Exercicio F                      
	            */
	        if(alunosE > alunosD){
	            qtdeMaisAlunoE = (alunosE - alunosD);
	            System.out.println("F) Escola E tem " + qtdeMaisAlunoE + " alunos que a escola D.");            
	        } else {           
	            System.out.println("F) Escola D tem uma quantidade maior de alunos");
	        }
	    }
	 
	}