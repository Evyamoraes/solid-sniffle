package exercicio5while;

import java.util.Scanner;

public class exercicio5while {

	public static void main(String[] args) {
		// Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando de 3 em 3
		// quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
		
		Scanner input = new Scanner(System.in);{
			
		int numero = 233;
				
		System.out.println(+numero);
		System.out.println("\n");
	
			do{

				if (numero >= 300 && numero <= 400) {
					numero += 3;
					System.out.println(numero);
					System.out.println(" somando de 3 em 3\n");
					}
				else{
					numero +=5;
					System.out.println(numero);
					System.out.println(" somando de 5 em 5\n");
					}
				}
					while (numero <= 456);
			}
		}
	}

