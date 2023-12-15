package br.ucsal;

import java.util.Arrays;


public class Pratica33 {

	public static void main(String[] args) {
		int nMax = 30;
		int [] nFibo = new int [nMax];
		int n1 = 0, n2 = 1, n3 = 0;
		
		
		for (int i = 0; i < nMax; i++) {
			nFibo[i] = n1;
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
		}
		System.out.println(Arrays.toString(nFibo));
	}
}
