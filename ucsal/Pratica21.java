package br.ucsal;

public class Pratica21 {
	/*Problema: ELaborar uma sequencia de valores inteiros, positivos, impares iniciada pelo número 1, contendo 20 elementos.*/
	public static void main(String[] args) {
		
		int valor = 1, contagem = 0;
		do {
		    System.out.print(valor+ " ");
			valor += 2;
			contagem++;
		}while(contagem < 20);
	}
}
