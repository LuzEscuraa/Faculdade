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
			resultado = subtra��o(primeiroValor, segundoValor);
			break;
		case 3:
			resultado = multiplica��o(primeiroValor, segundoValor);
			break;
		case 4:
			resultado = divis�o(primeiroValor, segundoValor);
			break;
		default:
			imprimir("Opera��o Inv�lida!");
			resultado = 0;
			break;
		
		}
		
		imprimir(resultado);
		
	}
	
	public static double obterDados() {
		@SuppressWarnings("resource")
		Scanner ent = new Scanner(System.in);
		imprimir("Usu�rio, informe um valor");
		return ent.nextDouble();
	}
	
	public static int obterOperacao() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		imprimir("Usu�rio, informe a opera��o desejada:"
				+ "\n (1)Soma"
				+ "\n (2)Subtra��o"
				+ "\n (3)Multiplica��o"
				+ "\n (4)Divis�o");
			return sc.nextInt();
	}
	
	public static void imprimir(double arg) {
		System.out.println(arg);
	}
	//*o nome pode permanecer "arg" pois s�o dois metodos diferentes.
	public static void imprimir(String arg) {
		System.out.println(arg);
	}
	
	public static double soma(double v1, double v2) {
		return v1 + v2;	
	}
	//*n�o interessa o nome que for atribuido as variaveis
	public static double subtra��o(double x1, double x2) {
		return x1 - x2;	
	}
	public static double multiplica��o(double a, double b) {
		return a * b;	
	}
	public static double divis�o(double x, double y) {
		return x / y;
	}
}

