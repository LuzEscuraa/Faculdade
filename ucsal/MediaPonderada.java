package br.ucsal;

import java.util.Scanner;

public class MediaPonderada {
	/*
	 * Crie uma classe de nome MediaPonderada e no seu método main elabore um
	 * algoritmo em JAVA para ler 02 valores de tipo double informados em um
	 * intervalo fechado de 0 a 10, logo após calcule a média ponderada desses
	 * valores. Para essa solução deve-se considerar que os pesos para cada valor já
	 * estão pré-fixados respectivamente em 3.8 e 6.2 e o resultado final
	 * apresentado deve ser a média calculada seguida do resultado final com base na
	 * seguinte regra: se o valor obtido da média for menor que 6 o resultado final
	 * deverá ser "Reprovado", caso contrário o resultado final deverá ser
	 * "Aprovado". Considere também que se qualquer dos valores informados estiver
	 * fora do intervalo definido, o resultado apresentado deverá ser:
	 * "Valor incorreto informado" e a execução encerrada.
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	double valor1, valor2, media;
	final double PESO1 = 3.8, PESO2 = 6.2;
	System.out.println("insira o valor 1");
	valor1= sc.nextDouble();
	System.out.println("insira o valor 2");
	valor2= sc.nextDouble();
	if (valor1>0 && valor1<=10 && valor2>0 && valor2<=10) {
	media= (valor1*PESO1 + valor2*PESO2)/(PESO1 + PESO2);
		if (media<6) {
			System.out.println(media+"reprovado");
		}else {
			System.out.println(media+"aprovado");
			}
	}else { 
			System.out.println("Valor incorreto informado");
	}
	}
}
