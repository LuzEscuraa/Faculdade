package br.ucsal;

import java.util.Scanner;

import java.util.InputMismatchException;

import java.util.Arrays;

public class Av3Lpa {

	public static void main(String[] args) {
		executar();
	}

	public static void executar() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String nome;
		int escolha;
		imprimir("Usuario, informe seu nome:");
		nome = sc.next();
		imprimir(nome + ",Escolha o jogo que deseja:");
		imprimir("[1]Jogo da Velha\n[2]Sair");
		escolha = sc.nextInt();
		
		if (escolha == 1) {
			escolha = jogoDaVelha();
		}
		if (escolha == 2) {
			imprimir("Que pena que voc� saiu!");
			System.exit(0);
		}

	}

	static Scanner in;
	static String[] tabuleiro;
	static String turno;
	static char[][] tab = {
			{'_','|', '_', '|', '_'},
			{'_', '|', '_', '|', '_'},
			{' ', '|', ' ', '|', ' '}};

	public static int jogoDaVelha() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		tabuleiro = new String[9];
		turno = "X";
		String ganhador = null;
		espa�oVazio();
		System.out.println("Jogo da velha");
		System.out.print("\n");
		impressao();
		System.out.println("O primeiro jogador ir� comecar e usar� o caractere �X�. O segundo jogador usar� o caractere �O�");
		System.out.println("jogador 1, escolh� um n�mero:");
		while (ganhador == null) {
			int numInput;
			try {
				numInput = sc.nextInt();
				if (!(numInput > 0 && numInput <= 9)) {
					System.out.println("sele��o inv�lida, digite novamente");
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("sele��o inv�lida, digite novamente");
				continue;
			}
			if (tabuleiro[numInput-1].equals(String.valueOf(numInput))) {
				tabuleiro[numInput-1] = turno;
				if (turno.equals("X")) {
					turno = "O";
				} else {
					turno = "X";
				}
				impressao();
				ganhador = verificarGanhador();
			} else {
				System.out.println("slot j� foi selecionado, digite novamente");
				continue;
			}
		}
		if (ganhador.equalsIgnoreCase("empate")) {
			System.out.println("Empate!");
		} else {
			System.out.println("Parab�ns ao " + ganhador + ", ele ganhou!");
		}
		return sc.nextInt();        
	}

	static String verificarGanhador() {
		for (int a = 0; a < 8; a++) {
			String linha = null;
			switch (a) {
			case 0:
				linha = tabuleiro[0] + tabuleiro[1] + tabuleiro[2];
				break;
			case 1:
				linha = tabuleiro[3] + tabuleiro[4] + tabuleiro[5];
				break;
			case 2:
				linha = tabuleiro[6] + tabuleiro[7] + tabuleiro[8];
				break;
			case 3:
				linha = tabuleiro[0] + tabuleiro[3] + tabuleiro[6];
				break;
			case 4:
				linha = tabuleiro[1] + tabuleiro[4] + tabuleiro[7];
				break;
			case 5:
				linha = tabuleiro[2] + tabuleiro[5] + tabuleiro[8];
				break;
			case 6:
				linha = tabuleiro[0] + tabuleiro[4] + tabuleiro[8];
				break;
			case 7:
				linha = tabuleiro[2] + tabuleiro[4] + tabuleiro[6];
				break;
			}
			if (linha.equals("XXX")) {
				return "X";
			} else if (linha.equals("OOO")) {
				return "O";
			}
		}
		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(tabuleiro).contains(String.valueOf(a+1))) {
				break;
			}
			else if (a == 8)
				return "empate";
		}

		System.out.println("vez do pr�ximo jogador, selecione um n�mero:");
		return null;
	}

	static void impressao() {
		System.out.println("| " + tabuleiro[0] + " | " + tabuleiro[1] + " | " + tabuleiro[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + tabuleiro[3] + " | " + tabuleiro[4] + " | " + tabuleiro[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + tabuleiro[6] + " | " + tabuleiro[7] + " | " + tabuleiro[8] + " |");
	}

	static void espa�oVazio() {
		for (int a = 0; a < 9; a++) {
			tabuleiro[a] = String.valueOf(a+1);
		}
	}


	public static void imprimir(String arg) {
		System.out.println(arg);	
	}
}