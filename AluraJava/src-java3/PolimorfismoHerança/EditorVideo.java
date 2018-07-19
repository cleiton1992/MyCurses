package PolimorfismoHerança;
//Gerente eh um Funcionario, Gerente herda da class Funcionario
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o mÃ©todo de bonificacao do Editor de video");
		return 150;
	}	

}