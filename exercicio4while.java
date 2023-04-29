package exercicio4while;

import java.util.Scanner;

public class exercicio4while {

	public static void main(String[] args) {
		// Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três
		// (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita 5,
		// deveremos observar na tela a seguinte sequência: 5 15 45 135.
		
	try	(Scanner input = new Scanner(System.in)) {
			
			int numero;
			
			System.out.println("Digite um número: ");
			numero = input.nextInt();
			
			while (numero <= 100);
	        {
	        	numero = numero * 3;
	        	System.out.println("\nValor multiplicado por 3 até maior 100: "+numero);
	        }
		}
	}
}
