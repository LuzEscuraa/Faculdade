package br.ucsal;

import java.util.Scanner;

public class q1l {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Insira a temperatura em celcius");
		int C = sc.nextInt();
		int F = ((9*C)+160)/5;
		System.out.println("A temperatura em Farenheit é " + F);
	}
}
