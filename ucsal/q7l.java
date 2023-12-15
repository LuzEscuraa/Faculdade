package br.ucsal;

import java.security.KeyStore.TrustedCertificateEntry;
import java.util.Scanner;

public class q7l {
	
	public static void main(String[] args) {
			
		int v1,v2,v3;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		v1 = sc.nextInt();
		v2 = sc.nextInt();
		v3 = sc.nextInt();
		
		if (v1 < (v2 + v3)) {
			if(v2 < (v1 + v3)) {
				if(v3 < (v2 + v1)) {
					System.out.println("É um triangulo");
						if(v1 == v2 && v1 == v3 && v2 == v3) {
							System.out.println("e é equilátero");
								}else if(v1 == v2 && v2 != v3 && v1 != v3 || v1 == v3 && v1 != v2 && v3 != v2 || v3 == v2 && v2 != v1 && v1 != v3 ) {
									System.out.println(" e é isósceles ");
										}else if(v1 != v2 && v1 != v3 && v2 != v3) {
											System.out.println(" e é escaleno");
					}	
				}
			}
		}
	}
}
