package br.ucsal;

public class Repeti��o {
	
	public static void main(String[] args) {
		int valorSequencia = 2, contarElementos = 0;
		do {
		    System.out.println(valorSequencia + " ");
			valorSequencia += 2;
			contarElementos++;
		}while(contarElementos < 10);
	}

}
