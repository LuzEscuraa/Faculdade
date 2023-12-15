package lpaAtividades;

import java.util.Scanner;

public class Pratica27 {
	//Não consegui concluir

	public static void main(String[] args) {
		int cont = 0, vin = 10, raz = 6, vlim;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Usuário informe um valor entre 50 e 100 para ser o valor limite");
		vlim = sc.nextInt();
		if(vlim < 50 || vlim > 100) {
			do {

				System.out.println("valor fora do intervalo! informe um valor entre 50 e 100 para ser o valor limite");
				vlim = sc.nextInt();

			}while(vlim < 50 || vlim > 100);

		}else {
			for (; cont < vlim ;) {
				System.out.print(vin + " ");
				vin += raz;
				cont++;
				
			}


		}
	}
}
