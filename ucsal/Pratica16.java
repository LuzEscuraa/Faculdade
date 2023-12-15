package br.ucsal;

import java.util.Scanner;

public class Pratica16 {
	/*
	 * Problema: elabore uma solução para implementar uma calculadora das 04
	 * operações básicas: somar, dividir, subtrair e multiplicar utilizando a
	 * estrutura switch/case. Nessa solução o usuário deverá informar apenas dois
	 * valores e escolher a operação que deseja realizar em um menu de opções
	 * elaborado com switch/case. Para essa solução, considere os seguintes
	 * critérios: a) O usuário deverá informar valores iguais ou superiores a 1 b)
	 * No caso da divisão é possível que o resultado seja um valor decimal c) Caso o
	 * usuário escolha uma operação diferente das disponibilizadas, o resultado
	 * deverá ser valor inválido.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor1, valor2, resultado;
		System.out.println("Insira o dois valores maiores ou iguais a um");
		valor1 = sc.nextDouble();
		valor2 = sc.nextDouble();
		System.out.println("Insira o tipo de operação a ser realizada \n 01: Soma, \n 02: Multiplicação, \n 03: Divisão, \n04: Subtração.");
		int operacao = sc.nextInt();
		if (valor1<1 && valor2<1) {
			System.out.println("Valor inválido");
		}else {
		switch (operacao) {
		case 1: // soma
			resultado = valor1 + valor2;
			System.out.println("o resultado é" + resultado);
			break;

		case 2:// multiplicação
			resultado = valor1 * valor2;
			System.out.println("o resultado é" + resultado);
			break;

		case 3:// divisão
			resultado = valor1 / valor2;
			System.out.println("o resultado é" + resultado);
			break;

		case 4:// subtração
			resultado = valor1 - valor2;
			System.out.println("o resultado é" + resultado);
			break;

		default:
			System.out.println("valor inválido");
		}
		}
	}
}
