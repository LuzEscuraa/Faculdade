package br.ucsal;

import java.util.Scanner;

public class q6l {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double qtt;
		
		System.out.println("Insira a quantidade de maçãs");
		qtt = sc.nextDouble();
		
		if (qtt >= 12) { 
			double preco1 = 0.25;
				double valor1 = qtt * preco1;
				System.out.println("o valor da compra é " + valor1);
		} else {
			double preco2 = 0.30;
				double valor2 = qtt * preco2;
				System.out.println("o valor da compra é " + valor2);
		}
		
	}

}
