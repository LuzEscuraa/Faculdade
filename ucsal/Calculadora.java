package br.ucsal;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double valor1, valor2, resultado;
		System.out.println("Insira o primeiro valor");
		valor1= sc.nextDouble();
		System.out.println("Insira o segundo valor");
		valor2= sc.nextDouble();
		System.out.println("Insira o tipo de operação a ser realizada \n 01: Soma, \n 02: Multiplicação, \n 03: Divisão, \n04: Subtração.");
		int operacao= sc.nextInt();   
		switch (operacao)
		{
		case 1: //soma
			resultado= valor1+valor2;
			System.out.println("o resultado é"+resultado);
			break;

		case 2://multiplicação
			resultado= valor1*valor2;
			System.out.println("o resultado é"+resultado);
			break;

		case 3://divisão
			resultado= valor1/valor2;
			System.out.println("o resultado é"+resultado);
			break;

		case 4://subtração
			resultado= valor1-valor2;
			System.out.println("o resultado é"+resultado);
			break;

		default: 
			System.out.println("Operação inválida");
		}

	}
}



