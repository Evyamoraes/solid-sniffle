package Atvidade_Array1;

import java.util.Scanner;

public class Atvidade_Array1 {

	public static void main(String[] args) {
		// Faça um program que crie um vetor por leitura com 5 valores de pontuação de uma atividade 
		// e o escreva em seguida. Encontre após a maior pontuação e a apresente.
		
		 Scanner input = new Scanner(System.in);{
		
			int[] vetor;
			int maior;
		
			while(true) {
				vetor = new int[5];
				maior = 0;
			for (int i=0; i< vetor.length; i++){
				System.out.print("Digite o " +(i+1)+ "º valor: ");
				vetor[i] = new Scanner(System.in).nextInt();
				
				if(vetor[i] > maior) {
					maior = vetor[i];
				}
			}
			System.out.println("O maior valor é: "+maior);
			System.out.println("");
			}
		
		 }	
	}
}

