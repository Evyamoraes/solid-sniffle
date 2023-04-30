package atividadearray2;

import java.util.Scanner;

public class atividadearray2 {

	public static void main(String[] args) {
		// Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor
		// com os lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética dos
		// lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.
		
		 Scanner input = new Scanner(System.in);{

		int dado = 10;
		int x, maiorPont=0, cont=0, qtCont=0;
		int mediaAritmetica=0, somaLanc=0;
			
				for(x=0;x<=10;x++){
					
					System.out.print("\nEntre com o valor do dado: ");
						dado = input.nextInt();
						
					if (dado < 1 | dado > 6){ 
						System.out.print("\nDado está com valor inválido! ");
						System.out.print("\nEntre com o valor do dado: ");
						dado = input.nextInt();
					} 
				}				
						for(x=0;x<10;x++)
					{
							if(maiorPont == dado);
							{
								qtCont++;
							}
					}

				mediaAritmetica = somaLanc/10;
				
				System.out.print("\nA média aritmética é: "+mediaAritmetica);
				System.out.print("\nMaior lançamento: "+qtCont);
	}

}
}