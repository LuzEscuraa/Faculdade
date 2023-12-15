package br.ucsal;

import java.util.Scanner;
//fibo
public class q10l {
	public static void main(String[] args) {
		int vin = 1, v2 = 0;
		Scanner sc = new Scanner(System.in);
		int lim = sc.nextInt();
			for (int i = 0; i < lim; i++) {
				System.out.print(vin + " ");
				vin = vin + v2;
				v2 = vin - v2;
			}
		
	}
}
