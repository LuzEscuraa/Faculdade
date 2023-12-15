package br.ucsal;

public class Aa {
public static void main(String[] args) {
	
	final int QT = 20;
			int pri = 0, seg = 1, aux = 0, cont = 0;
			do {
				System.out.println(pri + " ");
				aux = pri + seg;
				pri = seg;
				seg = aux;
				cont++;
			} while (cont < QT);
}
}
