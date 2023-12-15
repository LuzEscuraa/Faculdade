package br.ucsal;

public class Pratica31 {
/*Problema: elabore uma solu��o para construir dinamicamente uma sequencia de valores inteiros,
 *  crescentes, pares, iniciada pelo valor 2, contendo 15 elementos. 
 *  Considere que a sequencia dever� ser constru�da de forma que cada valor 
 *  da sequencia seja um elemento de um array unidimensional que ser� retornado de um m�todo. 
 *  Ao final o array dever� ser impresso apresentando a sequencia elaborada.*/
	public static void main(String[] args) {
		int tdv = 15;
		imprimir(seq(tdv));
				
	}
	public static int[] seq(int tamanho) {
		int[] seq = new int [tamanho];
		for (int i = 0, num = 2; i < seq.length; i++, num+=2) {
			seq[i] = num;
		}
		return seq;
	}
	
	public static void imprimir(int[] vet) {
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
	}
}
