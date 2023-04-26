package Exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		// expressa em anos, meses e dias.
		
		Scanner input = new Scanner(System.in);{

		int idade;
		int anos;
		int dias;
		int meses;
		
		System.out.println("Informe a idade em dias: "); 
		idade = input.nextInt();
		
		anos = idade / 365;
		dias = idade % 365;
		meses = dias / 30;
		dias = dias % 30;
		
		System.out.println( "Você tem " +anos+ " anos, " +meses+ " meses e " +dias+ " dias de vida");
		
		input.close();
		}
		
	}
}
