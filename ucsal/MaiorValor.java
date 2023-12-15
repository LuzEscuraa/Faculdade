package br.ucsal;

import java.util.Scanner;

public class MaiorValor {
	/*
	 * Crie uma classe de nome MaiorValor e no seu método main elabore um algoritmo
	 * em JAVA para ler 03 valores inteiros aleatórios não repetidos informados pelo
	 * usuário em um intervalo fechado de 10 a 90, seja apresentado o maior valor
	 * dos três informados. Para isso, considere que: (1) caso algum valor informado
	 * esteja fora do intervalo ou repetido o resultado apresentado deve ser
	 * "valores incorretos".
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int valor1, valor2, valor3;
		System.out.println("insira sem repetir, em ordem crescente, três valores entre 10 e 90.");
		valor1= sc.nextInt();
		valor2= sc.nextInt();
		valor3= sc.nextInt();
		
		if (valor1 = valor2 && valor2 <= valor3 && valor3 <= valor1) { 
			System.out.println("valores incorretos");
		}else if (valor1<10 && valor1>90)(valor1<10 && valor2>90)(valor3<10 && valor3>90) {
				System.out.println("valores incorretos");
		}else { (valor1>>valor2>>valor3||valor2>>valor1>>valor3||valor3>>valor2>>valor1);
	        System.out.println(valor1+"é o maior valor");}
	}
}
	
