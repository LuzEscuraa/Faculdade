package br.ucsal;

import java.util.Scanner;

public class Pratica17 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int pontos = 0;
		char alternativa ;
		System.out.println("Indique, entre as opções, um animal considerado invertebrado  \n(a): minhoca, \n(b): aranha, \n(c): cachorro, \n(d): gato.");
		alternativa = sc.next().charAt(0);
		switch (alternativa) {
		case 'a': //Minhoca
		case 'b': //aranha
			System.out.println("Resposta correta pontuação " + pontos + 1);
			break;
		case 'c': //cachorro
		case 'd':
			System.out.println("resposta errada pontuação " + pontos);
			break;
		default:
			System.out.println("você não selecionou uma questão pontuação 0");
		}
	}
}
