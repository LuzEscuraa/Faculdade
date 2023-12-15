package br.ucsal;

import java.util.Scanner;

public class q4l {
	//Faça um programa em Java que receba as horas de início e fim de uma atividade (expressas em horas,
			//minutos e segundos) e ao final informe o tempo de duração da atividade. Dica: transforme as horas de início
			//e fim em segundos, realize a subtração e em seguida volte a transformar em horas, minutos e segundos.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hora1, minuto1, segundo1;
		System.out.println("Informe a hora de inicio");
		hora1 = sc.nextInt();
		System.out.println("informe os minutos iniciais");
		minuto1 = sc.nextInt();
		System.out.println("informe os segundos iniciais");
		segundo1 = sc.nextInt();
		
		int hora2, minuto2,segundo2;
		
		System.out.println("Informe a hora de inicio");
		hora2 = sc.nextInt();
		System.out.println("informe os minutos iniciais");
		minuto2 = sc.nextInt();
		System.out.println("informe os segundos iniciais");
		segundo2 = sc.nextInt();
		
		int sph, spm, stt;
		
		sph = (hora1 - hora2)*3600;
		spm = (minuto2 - minuto2)*60;
		stt = sph + spm;
		System.out.println("O total de segundos passados é: " + stt);
	}

}
