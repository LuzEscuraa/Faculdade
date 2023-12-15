package br.ucsal;

import java.util.Scanner;

public class Pratica26 {

	public static void main(String[] args) {
		executar();
		
	}
	public static void executar() {
		double primeiroValor = obterDados(),
				segundoValor = obterDados();
		int operacaoEscolhida = obterOperacao();
		
		double resultado;
		//*Executando a calculadora
		switch(operacaoEscolhida) {
		case 1:
			resultado = soma(primeiroValor, segundoValor);
			break;
		case 2:
			resultado = subtração(primeiroValor, segundoValor);
			break;
		case 3:
			resultado = multiplicação(primeiroValor, segundoValor);
			break;
		case 4:
			resultado = divisão(primeiroValor, segundoValor);
			break;
		default:
			imprimir("Operação Inválida!");
			resultado = 0;
			break;
		
		}
		
		imprimir(resultado);
		
	}
	
	public static double obterDados() {
		@SuppressWarnings("resource")
		Scanner ent = new Scanner(System.in);
		imprimir("Usuário, informe um valor");
		return ent.nextDouble();
	}
	
	public static int obterOperacao() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		imprimir("Usuário, informe a operação desejada:"
				+ "\n (1)Soma"
				+ "\n (2)Subtração"
				+ "\n (3)Multiplicação"
				+ "\n (4)Divisão");
			return sc.nextInt();
	}
	
	public static void imprimir(double arg) {
		System.out.println(arg);
	}
	//*o nome pode permanecer "arg" pois são dois metodos diferentes.
	public static void imprimir(String arg) {
		System.out.println(arg);
	}
	
	public static double soma(double v1, double v2) {
		return v1 + v2;	
	}
	//*não interessa o nome que for atribuido as variaveis
	public static double subtração(double x1, double x2) {
		return x1 - x2;	
	}
	public static double multiplicação(double a, double b) {
		return a * b;	
	}
	public static double divisão(double x, double y) {
		return x / y;
	}
}

