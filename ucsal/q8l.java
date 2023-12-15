package br.ucsal;

import java.util.Scanner;

public class q8l {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecione o seu enquadramento"
				+ "\n nivel1"
				+ "\n nivel2"
				+ "\n nivel3");
		int esc = sc.nextInt();
		switch(esc) {
		case 1:
			int nv1 = 12;
			int ha1;
			int sal1;
			System.out.println("Informe a quantidade de horas aulas trabalhadas");
			ha1 = sc.nextInt();
			sal1 = ha1*nv1;
			System.out.println("O seu salário é " + sal1);
		case 2:
			int nv2 = 17;
			int ha2;
			int sal2;
			System.out.println("Informe a quantidade de horas aulas trabalhadas");
			ha2 = sc.nextInt();
			sal2 = ha2*nv2;
			System.out.println("O seu salário é " + sal2);
		case 3:
			int nv3 = 25;
			int ha3;
			int sal3;
			System.out.println("Informe a quantidade de horas aulas trabalhadas");
			ha3 = sc.nextInt();
			sal3 = ha3*nv3;
			System.out.println("O seu salário é " + sal3);
		}
		
	}

}
