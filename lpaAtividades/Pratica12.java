package lpaAtividades;

import java.util.Scanner;

public class Pratica12 {

	public static void main(String[] args) {

		double valor1, valor2, resultado;
		Scanner sc = new Scanner(System.in);
		System.out.println("usuario informe o prjmeiro valor");
		valor1 = sc.nextDouble();
		System.out.println("usuario informe o segundo valor");
		valor2 = sc.nextDouble();
		System.out.println("Por favor selecione"
				+ "o tipo de opera��o que deseja realizar"
				+ "\n(1) SOMA"
				+ "\n(2) SUBTRA��O"
				+ "\n(3) DIVISAO"
				+ "\n(4) MULTIPLICA��O");
		int opera��o = sc.nextInt();
		
		switch(opera��o){
		case 1: //soma
			resultado = valor1 + valor2;
			System.out.println("o resultado � " + resultado);

			break;

		case 2: //subtra��o
			resultado = valor1 - valor2;
			System.out.println("o resultado � " + resultado);

			break;

		case 3: //Divis�o{}

			resultado = valor1 / valor2;
			System.out.println("o resultado � " + resultado);

			break;

		case 4: //multiplica��o
			resultado = valor1 * valor2;
			System.out.println("o resultado � " + resultado);

			break;

		default:
			break;
		}
	}

}
