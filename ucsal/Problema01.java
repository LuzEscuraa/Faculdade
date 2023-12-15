package br.ucsal;

import java.util.Scanner;


public class Problema01 {

	public static void main(String[] args) {
		int posicaoElemento = 16;
        int posicao2 = 89;
        int tamanhoDoVetor = 30;
        int media;
        int soma;
        int soma1;
        int soma2;
        /*media = (soma + soma2)/ 30;*/
        imprimir(sequencia3(tamanhoDoVetor), posicaoElemento);

	}

	public static int[] sequencia1(int tam, int valorinicial) {
		tam  = 30;
		int[] seq = new int [tam];
		for (int i = 0, num = 6; i < seq.length; i++, num +=3) {
			if (num % 2 == 0)
			 seq[i] = num;

		}
		 int i, soma1=0;

		 for(i=0; i< tam ; i++)
		 {
			 soma1=soma1+seq[i];
		 }
				
		return seq;
		
	}


	public static int[] sequencia2(int vetor) {
		vetor  = 30;
		int[] seq = new int [vetor];
		for (int i = 0, num = 6; i < seq.length; i++, num +=3) {
			if (num % 2 == 0)
			 seq[i] = num;

		}
				
		return seq;
		}


	public static int[] sequencia3(int tam) {
		 int soma = 1;
	        int seq [] = new int[tam];
	        for(int cont = 0, pri = 0, seg = 1, ter = 1; cont < tam; cont++) {
	        seq[cont] = pri;
	        ter = pri + seg;
	        pri = seg;
	        seg = ter;
	        soma = soma + seq[cont];
	        }
	        System.out.println(soma);
		return seq;
	}
	
/*	public static double mediaPonderada(int[] vetor) {
		int soma2;
		int media;

		media = soma2 /  10;   
		soma2 = 610 + 89;
		soma2 = soma2 + seq[i];
	}return soma2;*/

	/*public static double mediaAritimetica(int[] vetor1, int[] vetor2) {
	 int soma1;
	 int media;
		
		/*return resultado;
		
	}
	/* public static void resultado(int soma, soma2) {
		 int resultado = (soma1 + soma2)/30;
}*/
	

	 public static void imprimir(int[] v) {
	        for (int i = 0; i < v.length; i++) {
	            System.out.print(v[i] + " ");
	        }
	    }

	    public static void imprimir(int[] v, int posicao) {
	        System.out.println(v[posicao]);
	    }

	    public static void imprimir(String str) {
	        System.out.println(str);
	        StringBuilder s1 = new StringBuilder("macarrao"); StringBuilder s2 = s1.reverse();
	    }public static void imprimir(int args) {
	        System.out.println(args);
	    }
	
	}

