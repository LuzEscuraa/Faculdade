package br.ucsal;

import java.util.Scanner;

public class Pratica16 {
	/*
	 * Problema: elabore uma solu��o para implementar uma calculadora das 04
	 * opera��es b�sicas: somar, dividir, subtrair e multiplicar utilizando a
	 * estrutura switch/case. Nessa solu��o o usu�rio dever� informar apenas dois
	 * valores e escolher a opera��o que deseja realizar em um menu de op��es
	 * elaborado com switch/case. Para essa solu��o, considere os seguintes
	 * crit�rios: a) O usu�rio dever� informar valores iguais ou superiores a 1 b)
	 * No caso da divis�o � poss�vel que o resultado seja um valor decimal c) Caso o
	 * usu�rio escolha uma opera��o diferente das disponibilizadas, o resultado
	 * dever� ser valor inv�lido.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor1, valor2, resultado;
		System.out.println("Insira o dois valores maiores ou iguais a um");
		valor1 = sc.nextDouble();
		valor2 = sc.nextDouble();
		System.out.println("Insira o tipo de opera��o a ser realizada \n 01: Soma, \n 02: Multiplica��o, \n 03: Divis�o, \n04: Subtra��o.");
		int operacao = sc.nextInt();
		if (valor1<1 && valor2<1) {
			System.out.println("Valor inv�lido");
		}else {
		switch (operacao) {
		case 1: // soma
			resultado = valor1 + valor2;
			System.out.println("o resultado �" + resultado);
			break;

		case 2:// multiplica��o
			resultado = valor1 * valor2;
			System.out.println("o resultado �" + resultado);
			break;

		case 3:// divis�o
			resultado = valor1 / valor2;
			System.out.println("o resultado �" + resultado);
			break;

		case 4:// subtra��o
			resultado = valor1 - valor2;
			System.out.println("o resultado �" + resultado);
			break;

		default:
			System.out.println("valor inv�lido");
		}
		}
	}
}
