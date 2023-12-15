package br.ucsal;

public class Pratica22 {

	/*
	 * Problema: elabore uma solução para apresentar uma sequencia, construída
	 * dinamicamente, com os 12 primeiros valores múltiplo de 2, com a variável
	 * inicializada com valor 1, utilizando uma estrutura de repetição com teste no
	 * início (do/while).
	 */
	public static void main(String[] args) {
		
		int vInicial = 1,valor = 2, contagem = 0;
		do {
			if (vInicial== 1 ) {
				vInicial++;
			}
	      System.out.print(vInicial + " ");
	      vInicial = vInicial + valor;	
		  contagem++;
		}while(contagem < 12);
	}
}
