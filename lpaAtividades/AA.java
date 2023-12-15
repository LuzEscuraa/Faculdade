package lpaAtividades;

import java.util.Scanner;

public class AA {
	
	public static char[][] tabuleiro(int l, int c) {
		char[][] bid = new char[l][c];
		bid[0][0] = 'X';
		bid[1][2] = 'O';
		bid[0][2] = 'X';
		bid[0][1] = 'O';
		bid[1][1] = 'X';
		bid[2][2] = 'O';
		bid[2][0] = 'X';
		return bid;
	}
	
	private static void imprimir(char[][] arr) {
		String traco = " -------------";
		System.out.println(traco);
		for (int il = 0; il < arr.length; il++) {
			System.out.print(" | ");
			for (int ic = 0; ic < arr[il].length; ic++) {
				System.out.print(arr[il][ic] + " | ");
			}
			System.out.println();
			System.out.println(traco);
		}
		System.out.println();
	}

}
