package br.ucsal;

import java.util.Scanner;

public class q3l {
//Faça um programa em Java que receba 3 notas de um aluno e seus respectivos pesos, calcule e informe a média ponderada.
	//Considerei os pesos 1 para a nota 1, 3 para a nota 2, e 2 para a nota 3
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3,media;
		int p1 = 1; 
		int	p2 = 3; 
		int p3 = 2;
		System.out.println("Informe a primeira nota");
		n1 = sc.nextInt();
		System.out.println("Informe a segunda nota");
		n2 = sc.nextInt();
		System.out.println("Informe a terceira nota");
		n3 = sc.nextInt();
		
		media = ((n1+n2+n3)/p1+p2+p3);
		System.out.println("Sua média é " + media);
		
	}
}
