package lpaAtividades;

public class Pratica24 {
	
	public static void main(String[] args) {
		int cont = 0, v1=0, v2=1;
		do {
		System.out.print(v1 + " ");	
		v1 = v1 + v2;
		v2= v1 -v2;
			cont++;
		}while(cont < 20);
	}

}
