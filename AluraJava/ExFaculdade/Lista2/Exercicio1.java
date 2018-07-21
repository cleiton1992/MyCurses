package Lista2;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args){            
        
        int maisVisitantesSabado, diferencaSextaSegunda, qtdeVisitantesQuarta;
        
        String[] semanas = {"Segunda","Terca","Quarta","Quinta","Sexta","Sabado","Domingo"};
        Scanner entrada = new Scanner(System.in);
        int qtdeSemanas = semanas.length;
        int[] qtdePessoas = new int[qtdeSemanas];
                
        int maisVisitantes = 0;
        int somaVisitantes = 0;
        int visitantesSabado = 0;
        int visitantesDomingo = 0;
        int visitantesSexta = 0;
        int visitantesSegunda = 0;
        int visitantesQuarta = 0;
        int visitantesTerca = 0;        
        int menosVisitantes = 0;
      
        for(int i=0; i<qtdeSemanas; i++){
            System.out.println("Quantos visitantes na " + semanas[i]+"?");            
            qtdePessoas[i] = entrada.nextInt();
            
            /*
            Exercicio A                        
            */            
            if(qtdePessoas[maisVisitantes] < qtdePessoas[i]){  
                maisVisitantes = i;
            }             
            /*
            Exercicio F                        
            */
            else if(qtdePessoas[maisVisitantes] > qtdePessoas[i]){
                menosVisitantes = i;
            }
            /*
            Exercicio B                      
            */
            somaVisitantes+=qtdePessoas[i]; 
  
            
            if(null != semanas[i])switch (semanas[i]) {
                case "Sabado":
                    visitantesSabado = qtdePessoas[i];
                    break;
                case "Domingo":
                    visitantesSabado = qtdePessoas[i];
                    break;
                case "Sexta":
                    visitantesSexta = qtdePessoas[i];
                    break;
                case "Segunda":
                    visitantesSegunda = qtdePessoas[i];
                    break;
                case "Quarta":
                    visitantesQuarta = qtdePessoas[i];
                    break;
                case "Terca":
                    visitantesTerca = qtdePessoas[i];
                    break;
                default:
                    break;
            }            
        }
  
        System.out.println("A) Mais visitantes na " + semanas[maisVisitantes] + "-Feira");
        System.out.println("B) Total de visitantes durante a semana " + somaVisitantes + " pessoas");
               
            /*
            Exercicio C                        
            */
        if (visitantesSabado > visitantesDomingo){    
                maisVisitantesSabado = (visitantesSabado - visitantesDomingo);
                System.out.println("C) Foram " + maisVisitantesSabado + " visitantes a mais que no Domingo");
            } else {
                System.out.println("C) Domingo compareceu mais visitantes que Sabado");
            }
        
            /*
            Exercicio D                      
            */
        diferencaSextaSegunda = (visitantesSexta - visitantesSegunda); 
        System.out.println("D) Diferenca de " + diferencaSextaSegunda + " visitantes entre Sexta e Segunda-Feira");
        
            /*
            Exercicio E                        
            */
        if (visitantesQuarta < visitantesTerca){
                qtdeVisitantesQuarta = (visitantesTerca - visitantesQuarta);
                System.out.println("E) Teriam que ir " + qtdeVisitantesQuarta + " visitantes a mais");
            } else if (visitantesQuarta > visitantesTerca)  {
                qtdeVisitantesQuarta = (visitantesQuarta - visitantesTerca);
                System.out.println("E) Teriam que ir " + qtdeVisitantesQuarta + " visitantes a menos");
            } else {
                System.out.println("E) Foi a mesma quantidade de visitantes");
            }
        
            /*
            Exercicio F                    
            */
        
        System.out.println("F) Menos visitantes na " + semanas[menosVisitantes] + "-Feira"); 
 
    }    
    
}

