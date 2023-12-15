package br.ucsal;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		imprimir ("notas da primeira unidade");
		double valor1 = obterValor(),
				valor2 = obterValor(),
				valor3 = obterValor(),
				media1 = mediaUnidade1(valor1,valor2,valor3);

		imprimir ("notas da segunda unidade");
		double valor4 = obterValor(),
				valor5 = obterValor(),
				valor6 = obterValor(),
				media2 = mediaUnidade2(valor4,valor5,valor6);

		double mediaFinal = mediaFinal(media1,media2);

		String resultado = resultadoFinal(mediaFinal);

		imprimir(resultado);
		imprimir(mediaFinal);
	}

	public static double mediaUnidade1(double v1, double v2, double v3) {
		double PESO1 = 2, PESO2 = 3, PESO3 = 5;
		double media = (v1*PESO1 + v2*PESO2 + v3*PESO3)/(PESO1 + PESO2 + PESO3);
		return media;
	}

	public static double mediaUnidade2(double v1, double v2, double v3) {
		double PESO1 = 3, PESO2 = 3, PESO3 = 4;
		double media = (v1*PESO1 + v2*PESO2 + v3*PESO3)/(PESO1 + PESO2 + PESO3);
		return media;
	}

	public static double mediaFinal(double v1, double v2) {
		double media = (v1 + v2)/2;
		return media;
	}
	public static String resultadoFinal(double v1) {
		String resultado;
		if (v1 >=6) {
			resultado = "APROVADO";
		}	else { resultado = "REPROVADO";
		}
		return resultado;
	}
	public static void imprimir(String str) {
		System.out.println(str);
	}
	public static void imprimir(double str) {
		System.out.println(str);
	}
	public static double obterValor() {
		Scanner sc = new Scanner(System.in);
		double valorInformado = 0;

		do {
			imprimir ("Informe valor dentro do intervalo de 0 a 10");
			valorInformado = sc.nextDouble();
		} while (valorInformado < 0 || valorInformado >10);
		return valorInformado;
	}}

