package br.ucsal;

public class Pratica24 {
	/*
	 * Problema: a sequencia Fibonacci � uma sequ�ncia de n�meros inteiros que
	 * iniciando por 0 e 1 tem os termos subsequentes correspondes � soma dos dois
	 * anteriores. Dessa forma, elabore uma solu��o para imprimir uma sequencia
	 * Fibonacci contendo os 20 primeiros valores de uma sequencia fibonacci
	 * utilizando a estrutura do / while.
	 */
	public static void main(String[] args) {
		int vin = 0, cont=0;
		do {
		System.out.print(vin + " ");	
		vin = vin + 1;
			cont++;
		}while(cont < 20);
	}
}
