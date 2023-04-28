package exercicio2ifelse;

import java.util.Scanner;

public class exercicio2ifelse {

	public static void main(String[] args) {
		// Faça um programa que entre com três números e coloque em ordem crescente.
		Scanner input = new Scanner(System.in); {
			
			float valor1, valor2, valor3;
		
				System.out.print("Insira o primeiro numero: ");
				valor1 = input.nextFloat();
	        
				System.out.print("Insira o segundo numero: ");
				valor2 = input.nextFloat();
	        
				System.out.print("Insira o terceiro numero: ");
				valor3 = input.nextFloat();
	        
	        
				if((valor1>valor2) && (valor2>valor3)){
					System.out.print("A ordem crescente é: "+valor3+", "+valor2+", "+valor1);
				}
				else if ((valor1<valor2) && (valor1>valor3)){
					System.out.print("A ordem crescente é "+valor3+", "+valor1+", "+valor2);
				}
				else if ((valor2>valor1) && (valor2<valor3)){
					System.out.print("A ordem crescente é "+valor1+", "+valor2+", "+valor3);
				}
				else if ((valor2<valor3) && (valor1>valor3)){
					System.out.print("A ordem crescente é "+valor2+", "+valor3+", "+valor1);
				}
				else if ((valor3>valor1) && (valor3<valor2)){
					System.out.print("A ordem crescente é "+valor1+", "+valor3+", "+valor2);
				}
				else {
					System.out.print("A ordem crescente é "+valor2+", "+valor1+", "+valor3);
				}
	          
		}
	}
}
