package atividadearray4;

import java.util.Scanner;

public class atividadearray4 {
	
	static final int LIN = 3;
	static final int COL = 3;

	public static void main(String[] args) {
		// Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
		// exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja,
		// diagonal principal.

		Scanner input = new Scanner(System.in);{
			
			int mat[][] = new int [LIN][COL];
			int dp=0, soma = 0;
			
			for(int i=0; i<LIN; i++) {
				for(int j=0; j<COL; j++) {
					System.out.print("\nDigite os valores da matriz 3x3: ");
					mat[i][j] = input.nextInt();
			}
		}
			for(int i=0; i<LIN; i++) {
				for(int j=0; j<COL; j++) {
					System.out.print("["+mat[i][j]+"]");
				}
				System.out.print("\n");
			}
			for (int[] linha : mat) {
			    for (int valor : linha) {
			        soma += valor;
								}
				}
			
			for(int i=0; i<LIN; i++) {
				for(int j=0; j<COL; j++) {
					if(i==j) {
						dp = dp +mat[i][j];
			}
			}
			}
			System.out.print("A soma dos valores da matriz é: "+soma);
			System.out.print("\nDiagonal principal é: "+dp);
		}
	}
}