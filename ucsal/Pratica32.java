package br.ucsal;

public class Pratica32 {

	public static void main(String[] args) {
		int tdv = 30;
		imprimir(sequencia(tdv));
	}
	

	public static int[] sequencia(int tam) {
		int[] seq = new int[tam];
		for (int i = 0, num = 1; i < seq.length; i++, num++) {
			seq[i] = num;
		}
		return seq;
	}
	
	public static void imprimir(int[] vet) {
		for (int i = 0; i< vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
	}
}

