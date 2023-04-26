package Exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
		//aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e
		//5,respectivamente.
		
		Scanner input = new Scanner(System.in);{
			
			float nota1;
			float nota2;
			float nota3;
			float media;
		
			System.out.println("Digite a primeira nota: "); 
			nota1 = input.nextFloat();
			
			System.out.println("Digite a segunda nota: "); 
			nota2 = input.nextFloat();
			
			System.out.println("Digite a terceira nota: "); 
			nota3 = input.nextFloat();
			
			nota1 = nota1 * 2;
			nota2 = nota2 * 3;
			nota3 = nota3 * 5;
			media = (nota1 + nota2 + nota3) / 3;
			
			System.out.println("Sua média final é:" + media);

			input.close();
	}
	}

}
