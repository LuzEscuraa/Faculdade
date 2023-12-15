package br.ucsal;

import java.util.Iterator;

public class PráticaVetor {

	public static void main(String[] args) {
		
		imprimir(obterIdades());
		imprimir(" ");
		imprimir(obterNomes());
		imprimir(" ");
		imprimir(obterMatriculas());
	}
	public static int [] obterIdades() {
		int [] idades = new int[5];
		idades[0] = 19;
		idades[1] = 21;
		idades[2] = 23;
		idades[3] = 18;
		idades[4] = 20;
		return idades;
	}
	
	public static String[] obterNomes() {
		String[] nomes = new String[5];
		nomes[0] = "João";
		nomes[1] = "Maria";
		nomes[2] = "José";
		nomes[3] = "Simone";
		nomes[4] = "Rosa";
		return nomes;
	}
	
	public static String[] obterMatriculas() {
		String[] matriculas = new String[5];
		matriculas[0] = "254878";
		matriculas[1] = "577883";
		matriculas[2] = "587845";
		matriculas[3] = "897514";
		matriculas[4] = "878824";
		return matriculas;
	}
	
	public static void imprimir(int [] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}
	}
	
	public static void imprimir(String s) {
		System.out.println(s);
	}
	
	public static void imprimir(String [] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
			
		}
	}
	
}
