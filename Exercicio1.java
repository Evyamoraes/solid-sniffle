package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa 
		// em segundos e mostre-o expresso em horas, minutos e segundos.
		
		Scanner input = new Scanner(System.in);{

		int horas;
		int minutos;
		int segundos;
		 
		System.out.println("Informe o tempo de duração em segundos: "); 
		segundos = input.nextInt(); 
		   

		horas = segundos / 3600;
		minutos = (segundos - (horas * 3600)) / 60;
		segundos = segundos - (horas * 3600) - (minutos * 60);

		System.out.println( " O tempo de duração em horas é "+ horas + " horas " );
		System.out.println( " O tempo de duração em minutos é "+ minutos + " minutos" );
		System.out.println(" O tempo de duração em segundos é " + segundos + " segundos" );
		
		input.close();
		}
	}

}
