package lpaAtividades;

import java.util.Scanner;

public class Pratica28 {
	public static void main(String[] args) {
		imprimir("insira o primeiro valor");
		double primeiroValor = obterValores();
		imprimir("insira o segundo valor");
		double segundoValor = obterValores();
		imprimir(" Selecione a operação desejada"
				+ "\n (1) Somar"
				+ "\n (2) Subtrair"
				+ "\n (3) Dividir"
				+ "\n (4) Multiplicar");
		int op = obterEscolha();
		double resultado = escolha(op);
		imprimir("o resultado é" + resultado);
	}
	public static int escolha(int operacao) {
		switch(operacao) {
		case 1://soma
			somar(operacao, operacao);
			break;
		case 2:
			subtrair(operacao, operacao);
			break;
		case 3:
			dividir(operacao, operacao);
			break;
		case 4:
			multiplicar(operacao, operacao);
			break;
		}
		return operacao;
	}
	
	public static double obterValores() {
		Scanner sc = new Scanner(System.in);
		return sc.nextDouble();
	}
	public static int obterEscolha() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	public static double somar(double v1, double v2) {
		double soma;
		soma = v1 + v2;
				return soma;		
	}
	public static double subtrair (double v1, double v2) {
		double sub;
		sub = v1 - v2;
		return sub;
	}
	public static double dividir(double v1, double v2) {
		double divide;
		divide = v1/v2;
		return divide;
	}
	public static double multiplicar(double v1, double v2) {
		double multi;
		multi = v1 * v2;
		return multi;
	}
	public static void imprimir(String str) {
		System.out.println(str);
	}
}

