package Exercicio4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Construa um programa em que, tendo como dados de entrada dois pontos
		// quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
		// que efetua tal cálculo é:
		
		Scanner input = new Scanner(System.in);{
			
			float x1;
			float x2;
			float y1;
			float y2;
			float d;
			
			System.out.println("Digite o valor de x1: "); 
			x1 = input.nextFloat();
			
			System.out.println("Digite o valor de x2: "); 
			x2 = input.nextFloat();
			
			System.out.println("Digite o valor de y1: "); 
			y1 = input.nextFloat();
			
			System.out.println("Digite o valor de y2: "); 
			y2 = input.nextFloat();
			
			d = (x2-x1) * (x2-x1) + (y2-y1) * (y2-y1);
			
			System.out.println("A tal distancia é:" + d);
		
			input.close();
		}
	}
}
