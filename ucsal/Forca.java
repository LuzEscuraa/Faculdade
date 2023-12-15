package br.ucsal;

import java.util.Scanner;

public class Forca {
	
	
	public static void imprimir(String arg) {
		System.out.println(arg);	
	}

	public static int jogoDaForca(){

		imprimir("Uma palavra com 5 letras, sem letras iguais!");
		@SuppressWarnings("resource")
		Scanner ent = new Scanner(System.in);

		int forca = 1, vencer = 0, perder = 0, contador = 0, letra1 = 0, letra2 = 0, letra3 = 0, letra4 = 0,
				letra5 = 0;
		String digito, letrasDigitadas[] = new String[100];

		while (forca == 1) {
			imprimir("Digite a letra:");
			digito = ent.next();
			letrasDigitadas[contador] = digito;
			contador++;
			if (!digito.equals("c") && !digito.equals("h") && !digito.equals("a") && !digito.equals("v")
					&& !digito.equals("e")) {
				imprimir("Letra inexistente.");
				perder++;
				if (perder == 1) {
					imprimir("------------------------");
					imprimir("|----------------------|");
					imprimir("|                      O");
					imprimir("|                       ");
					imprimir("|                       ");
				}
				if (perder == 2) {
					imprimir("------------------------");
					imprimir("|----------------------|");
					imprimir("|                      O");
					imprimir("|                      |");
					imprimir("|                       ");
				}

			}
			if (perder == 3) {
				imprimir("------------------------");
				imprimir("|----------------------|");
				imprimir("|                      O");
				imprimir("|                      |\\");
				imprimir("|                       ");

			}
			if (perder == 4) {
				imprimir("------------------------");
				imprimir("|----------------------|");
				imprimir("|                      O");
				imprimir("|                     /|\\");
				imprimir("|                       \\ ");

			}

			if (perder == 5) {
				imprimir("------------------------");
				imprimir("|----------------------|");
				imprimir("|                      O");
				imprimir("|                     /|\\");
				imprimir("|                     / \\");
				imprimir("Voce perdeu.");
				System.exit(0);

			}

			else {
				if (digito.equals("c")) {
					vencer++;
					letra1 = 1;
					imprimir("Você acertou a 1 letra!");
					imprimir("C _ _ _ _");
				}
				if (digito.equals("h")) {
					vencer++;
					letra2++;
					imprimir("Você acertou a 2 letra!");
					imprimir("_ h _ _ _");
				}
				if (digito.equals("a")) {
					vencer++;
					letra3 = 1;
					imprimir("Você acertou a 3 letra!");
					imprimir("_ _ a _ _");
				}
				if (digito.equals("v")) {
					vencer++;
					letra4 = 1;
					imprimir("Você acertou a 4 letra!");
					imprimir("_ _ _ v _");
				}
				if (digito.equals("e")) {
					vencer++;
					letra5 = 1;
					imprimir("Você acertou a 5 letra!");
					imprimir("_ _ _ _ e");

				}
				if (letra2 >= 2) {
					imprimir("Você não pode repetir a letra!");
					perder++;
				}
				if (letra1 == 1 && letra2 == 1 && letra3 == 1 && letra4 == 1 && letra5 == 1) {
					imprimir("A palavra era Chave!");
				}
				if (vencer == 5) {
					imprimir("Parabéns você acertou a palavra e venceu!");
					System.exit(0);

				}
			}
		}
		return ent.nextInt();
	} 
}
