package br.ucsal;

public class Pratica22 {

	/*
	 * Problema: elabore uma solu��o para apresentar uma sequencia, constru�da
	 * dinamicamente, com os 12 primeiros valores m�ltiplo de 2, com a vari�vel
	 * inicializada com valor 1, utilizando uma estrutura de repeti��o com teste no
	 * in�cio (do/while).
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
