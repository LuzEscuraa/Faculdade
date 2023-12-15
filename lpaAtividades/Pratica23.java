package lpaAtividades;

public class Pratica23 {

	public static void main(String[] args) {
		int vin = 99, cont = 0;
		do {
			if(vin % 3==0)
			System.out.print(vin + " ");
			vin--;
			cont++;
		}while(cont <= 15);
	}
}
