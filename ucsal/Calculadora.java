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
		System.out.println("Insira o tipo de opera��o a ser realizada \n 01: Soma, \n 02: Multiplica��o, \n 03: Divis�o, \n04: Subtra��o.");
		int operacao= sc.nextInt();   
		switch (operacao)
		{
		case 1: //soma
			resultado= valor1+valor2;
			System.out.println("o resultado �"+resultado);
			break;

		case 2://multiplica��o
			resultado= valor1*valor2;
			System.out.println("o resultado �"+resultado);
			break;

		case 3://divis�o
			resultado= valor1/valor2;
			System.out.println("o resultado �"+resultado);
			break;

		case 4://subtra��o
			resultado= valor1-valor2;
			System.out.println("o resultado �"+resultado);
			break;

		default: 
			System.out.println("Opera��o inv�lida");
		}

	}
}



