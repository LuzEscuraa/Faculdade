package br.ucsal;

public class PraticaVetor2 {

	
	public static void main(String[] args) {
		int tamanhoDoVetor = 30;
		imprimir(sequencia01(tamanhoDoVetor));
	}
	
	
	public static int[] sequencia01(int tam) {
		int[] seq = new int [tam];
		for (int i = 0 , num = 6; i < seq.length; i++, num+=3) {
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
	public static int[] sequencia3(int tam) {
		tam = 30;
		int [] nFibo = new int [tam];
		int n1 = 0, n2 = 1, n3 = 0;


		for (int i = 0; i < tam; i++) {
			nFibo[i] = n1;
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		 int i, soma2=0;

		 for(i=0; i< tam ; i++)
		 {
			 soma2=soma2+nFibo[i];
		 }
		return nFibo;
	}
	
	public static void imprimir(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
}

