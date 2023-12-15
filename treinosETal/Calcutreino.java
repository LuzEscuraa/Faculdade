package treinosETal;

import java.util.Scanner;

public class Calcutreino {

	public static void main(String[] args) {

		double valor1, valor2, resultado;
		Scanner sc = new Scanner(System.in);
		System.out.println("usuario informe o primeiro valor");
		valor1 = sc.nextDouble();
		System.out.println("usuario informe o segundo valor");
		valor2 = sc.nextDouble();
		System.out.println("Por favor selecione"
				+ "o tipo de operação que deseja realizar"
				+ "\n(1) SOMA"
				+ "\n(2) SUBTRAÇÃO"
				+ "\n(3) DIVISAO"
				+ "\n(4) MULTIPLICAÇÃO");
		int operação = sc.nextInt();
		switch(operação){
		case 1: //soma
			resultado = valor1 + valor2;
			System.out.println("o resultado é " + resultado);

			break;

		case 2: //subtração
			resultado = valor1 - valor2;
			System.out.println("o resultado é " + resultado);

			break;

		case 3: //Divisão{}

			resultado = valor1 / valor2;
			System.out.println("o resultado é " + resultado);

			break;

		case 4: //multiplicação
			resultado = valor1 * valor2;
			System.out.println("o resultado é " + resultado);

			break;

		default:
			break;
		}
		System.out.println("Deseja fazer mais alguma operação?"
				+ "\n(1)SIM"
				+ "\n(2)NÃO");
		int escolha = sc.nextInt();
		if(escolha == 1) {
			
		}else {
			System.out.println("FIM");
		}

	}

}

