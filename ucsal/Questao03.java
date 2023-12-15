package br.ucsal;

public class Questao03 {

public static void main(String[] args) {
	int v1 = 0, v2 = 1, v3 = 0;
	int fibo = 1;
	do {
		v3 = v1 + v2;
		v1 = v2;
		v2 = v3;
		fibo++;
		System.out.print(v3 + " ");
	}while (fibo < 30);
}
}
