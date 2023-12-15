package treinosETal;

import java.util.Scanner;

public class SeqComUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String seq;
		String txt;
		System.out.println("usuario informe a sequencia");
		seq = sc.next();
		System.out.println("usuario informe o trecho a ser identificado");
		txt = sc.next();



		if (seq.contains(txt)); {
			System.out.printf("A sequencia " + txt + " é presente na posição %d\n", seq.indexOf(txt));
		}

	}

}
