package br.ucsal;

public class Questao06 {

public static void main(String[] args) {
	
	int vin = 19, r = 4, v1=0;
	do {
		v1= vin + r;
	    r++;

		System.out.print(v1 + " ");
	}while (r < 500);
	
}
}
