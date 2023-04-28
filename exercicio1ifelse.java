package exercicio1ifelse;

import java.util.Scanner;

public class exercicio1ifelse {

	public static void main(String[] args) {
		// Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		Scanner input = new Scanner(System.in); {
		
			int valor1, valor2, valor3;
		
				System.out.print("Insira o primeiro numero: ");
				valor1 = input.nextInt();
	        
				System.out.print("Insira o segundo numero: ");
				valor2 = input.nextInt();
	        
				System.out.print("Insira o terceiro numero: ");
				valor3 = input.nextInt();
	        
	        
				if((valor1>valor2) && (valor1>valor3)){
					System.out.print("O maior é: "+valor1);
				}
				else if ((valor2>valor3) && (valor2>valor1)){
					System.out.print("O maior é: "+valor2);
				}
				else{
					System.out.print("O maior é: "+valor3);
				}
	          		System.out.print("\nEntre: "+valor1+", "+valor2+", "+valor3);
		}
	}
}
