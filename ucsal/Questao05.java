package br.ucsal;

public class Questao05 {

public static void main(String[] args) {
	int vin = 200, cont = 0;
	
	do { 
		if(vin % 3 == 0 && vin % 2 ==0) {
			cont++;
			System.out.print(vin + " ");
		}
		
		vin--;
		
	}while(cont < 17);
}
}
