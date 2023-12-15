package lpaAtividades;

import java.util.Scanner;

public class Pratica13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double v1, v2, v3, resultado;
		System.out.println("Usuário informe o primeiro valor");
		v1 = sc.nextDouble();
		System.out.println("Usuário informe o segundo valor");
		v2 = sc.nextDouble();
		System.out.println("Usuário informe o terceiro valor");
		v3 = sc.nextDouble();
		resultado = (v1 + v2 + v3)/3;

		if(resultado > 6) {
			System.out.println("Reprovado");
		}else {
			System.out.println("Aprovado.");
		}


	}

}
