package br.ucsal;

public class Pratica20 {

	public static void main(String[] args) {

		int var= 1, num= 1;
		final int LIMITE =12;
		while(var <= LIMITE) {
			if (num % 2 == 0 ) {
				System.out.print(num+" ");
				var++;
			}
			num++;
		}
	}
}