package exercicio_salario;

import java.util.Scanner;

public class exercicio_salario {

	public static void main(String[] args) {
		// 1- A prefeitura de uma cidade fez uma pesquisa entre 3 de seus habitantes, coletando dados sobre 
		//o salário e número de filhos. A prefeitura deseja saber:   
		//a) média do salário da população; 
		//b) média do número de filhos; 
		//c) maior salário; 
		//d) percentual de pessoas com salário até R$100,00.  
		
			try (Scanner input = new Scanner(System.in)) {
				{
				
				float salario, maiorSalario = 0, mediaSalario = 0, totalSalario = 0, contSalario = 0,
						 percentualSalario = 0, filhos, totalFilhos = 0, mediaFilhos = 0;
				
				for (int habitantes = 1; habitantes <= 3; habitantes++) {
					
				System.out.println ("Qual o seu salario: R$ ");
				salario = input.nextFloat();
				
				if(maiorSalario < salario){
				       maiorSalario += salario;
				       
				}maiorSalario = salario;
				
				if(salario <= 100){
				       contSalario++;
				}
				
				totalSalario += salario;
				mediaSalario = totalSalario / 3;
				percentualSalario = (contSalario / 3) * 100;
				
				System.out.println ("Digite a quantidade de filhos: ");
				filhos = input.nextFloat();
				
				totalFilhos += filhos;
				mediaFilhos = totalFilhos / 3;
				}
				System.out.println("A media do salario da populacao é R$ " +mediaSalario);
				System.out.println("A media do numero dos filhos é " +mediaFilhos);
				System.out.println("O maior salario é R$ " +maiorSalario);
				System.out.println("A percentagem das pessoas com salarios ate R$ 100,00 é "+percentualSalario+ "%");
				

}
			}
	}
}
	


