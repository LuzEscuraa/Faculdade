package br.ucsal;

import java.util.Scanner;

public class q5l {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		System.out.println("Olá quantos anos você tem ?");
		idade = sc.nextInt();
		
		if (idade<=15) {
			System.out.println("Sem permissão para votar");
		}else if (idade >= 18 && idade <= 64) {
			System.out.println("Voto Obrigatório");
		}else if(idade >= 16 && idade <= 17 || idade >= 65) {
			System.out.println("Voto Facultativo");
		}
	}
}
