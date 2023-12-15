package br.ucsal;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JogoDaVelha {
	
	static Scanner in;
	static String[] tabuleiro;
	static String turno;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		tabuleiro = new String[9];
		turno = "X";
		String ganhador = null;
		espaçoVazio();
		System.out.println("Jogo da velha");
		System.out.print("\n");
		impressao();
		System.out.println("O primeiro jogador irá comecar e usará o caractere ¨X¨. O segundo jogador usará o caractere ¨O¨");
		System.out.println("jogador 1, escolhá um número:");
		while (ganhador == null) {
			int numInput;
			try {
				numInput = in.nextInt();
				if (!(numInput > 0 && numInput <= 9)) {
					System.out.println("seleção inválida, digite novamente");
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("seleção inválida, digite novamente");
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
				System.out.println("slot já foi selecionado, digite novamente");
				continue;
			}
		}
		if (ganhador.equalsIgnoreCase("empate")) {
			System.out.println("Empate!");
		} else {
			System.out.println("Parabéns ao " + ganhador + ", ele ganhou!");
		}
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

		System.out.println("vez do próximo jogador, selecione um número:");
		return null;
	}

	static void impressao() {
		System.out.println("| " + tabuleiro[0] + " | " + tabuleiro[1] + " | " + tabuleiro[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + tabuleiro[3] + " | " + tabuleiro[4] + " | " + tabuleiro[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + tabuleiro[6] + " | " + tabuleiro[7] + " | " + tabuleiro[8] + " |");
	}

	static void espaçoVazio() {
		for (int a = 0; a < 9; a++) {
			tabuleiro[a] = String.valueOf(a+1);
		}
	}
}
