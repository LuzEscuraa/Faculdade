
package br.ucsal;

import java.util.Scanner;

public class Pa {
int pT, r, tA;	
	
	public void construtor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o Primeiro Termo e a Razão");
		pT = sc.nextInt();
		r = sc.nextInt();
	}

	public int proximoTermo(){
		
		for (int i = 0; i < r; ) {
			tA = pT + i;
			i++;
		}
		return tA;
	}
}
