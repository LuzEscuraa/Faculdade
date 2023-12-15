package br.ucsal;

import java.util.Scanner;

public class Questao02 {
	
	public static void main(String[] args) {
		double valorInformado = obterValor(), valorConvertido;
		int escolhaConversao = obterEscolha();
		switch (escolhaConversao) {
		case 1:
			valorConvertido = realDolar(valorInformado);
			
			break;
		case 2:
			valorConvertido = dolarReal(valorInformado);
			
			break;
		case 3:
			valorConvertido = realEuro(valorInformado);
			
			break;
		case 4:
			valorConvertido = euroReal(valorInformado);
			
			break;
		default:
			imprimir("operação inválida");
			break;
		}
	}

	public static double obterValor() {
		Scanner sc = new Scanner(System.in);
		double valorInformado = 0;

		do {
			imprimir ("Informe valor maior que 0");
			valorInformado = sc.nextDouble();
		} while (valorInformado < 1);
		return valorInformado;

	}

	public static int obterEscolha() {
		Scanner sc = new Scanner(System.in);
		int valorInformado = 0;

		do {
			imprimir ("Informe valor dentro do intervalo de 1 a 4"
					+ "\n(1) Real para Dolar"
					+ "\n(2) Dolar para Real"
					+ "\n(3) Real para Euro"
					+ "\n(4) Euro para Real");
			valorInformado = sc.nextInt();
		} while (valorInformado < 1 || valorInformado >4);
		return valorInformado;

	}

	public static double realDolar(double valor) {
		return valor * 0.18;
	}
	
	public static double dolarReal(double valor) {
		return valor / 0.18;
		
	}
	
	public static double realEuro(double valor) {
		return valor * 0.16;
	}
	
	public static double euroReal(double valor) {
		return valor / 0.16 ;
	}
	
	public static void imprimir(String str) {
		System.out.println(str);
	}
	public static void imprimir(double str) {
		System.out.println(str);
	}
}

