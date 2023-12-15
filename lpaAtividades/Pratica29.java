package lpaAtividades;

import java.util.Scanner;

public class Pratica29 {
	public static void main(String[] args) {
		imprimir("insira a temperatura");
		double temperatura = obterDados();
		imprimir(" Selecione a transformação desejada"
				+ "\n (1) Celcius para Kelvin"
				+ "\n (2) Kelvin para Celcius"
				+ "\n (3) Celcius para Farenheit"
				+ "\n (4) Farenheit para Celcius"
				+ "\n (5) Kelvin para Farenheit"
				+ "\n (6) Farenheit para Kelvin");
		int op = obterEscolha();
		double escolha = celciusKelvin(temperatura);
				escolha = kelvinCelcius(temperatura);
				escolha = celciusFarenheit(temperatura);
				escolha = farenheitCelcius(temperatura);
				escolha = kelvinFarenheit(temperatura);
				escolha = farenheitKelvin(temperatura);
		imprimir("o resultado é" + escolha + "graus na escala escolhida");
	}
	public static double obterDados() {
		Scanner sc = new Scanner(System.in);
		return sc.nextDouble();
	}
	public static int obterEscolha() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	public static double celciusKelvin(double v1) {
		double kc;
		kc = v1 + 273;
		return kc;
	}
	public static double kelvinCelcius(double v1) {
		double ck;
		ck = v1 - 273;
		return ck;	
	}
	public static double celciusFarenheit(double v1) {
		double fc;
		fc = v1* 1.8 + 32;
		return fc;		
	}
	public static double farenheitCelcius(double v1) {
		double cf;
		cf = (v1 - 32)/1.8;
		return cf;	
	}
	public static double kelvinFarenheit(double v1) {
		double fk;
		fk = ((v1 - 273)*1.8) + 32 ;
		return fk;	
	}
	public static double farenheitKelvin(double v1) {
		double kf;
		kf = ((v1-32)*5/9)+273;
		return kf;
	}
	public static void imprimir(String str) {
		System.out.println(str);
	}

}
