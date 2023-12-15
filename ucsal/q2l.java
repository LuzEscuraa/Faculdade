package br.ucsal;

import java.util.Scanner;

public class q2l {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int hora, minuto, segundo;
		System.out.println("Informe a hora");
		hora = sc.nextInt();
		System.out.println("informe os minutos");
		minuto = sc.nextInt();
		System.out.println("informe os segundos");
		segundo = sc.nextInt();
		
		int sph, spm, stt;
		sph = hora*3600;
		spm = minuto*60;
		
		stt= sph+spm;
		System.out.println("Ja se passaram " + stt + " segundos");
	}
}
