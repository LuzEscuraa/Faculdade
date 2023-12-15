package OCarro;

import java.util.Random;

public class Corrida {

	private boolean isCorrendo;	

	public void Correr(Carro carro1, Carro carro2) {
		Random gerador = new Random();

		String IconCarro1 = "¹o^o¬";
		String IconCarro2 = "²ô^ô¬";
		
		isCorrendo = true;
		while(isCorrendo == true) {		

			for(int i=0;i<carro1.getPosicaoRelativa();i++) {
				System.out.print(" ");
			}
			System.out.println(IconCarro1);
			for(int i=0;i<carro2.getPosicaoRelativa();i++) {
				System.out.print(" "); 
			}
			System.out.println(IconCarro2);
			System.out.println("================================================================================");

			carro1.setVelocidade(carro1.getVelocidade() + gerador.nextInt(2) + 1);
			carro2.setVelocidade(carro2.getVelocidade() + gerador.nextInt(2) + 1);

			carro1.atualizarPosiRes();
			carro2.atualizarPosiRes(); 

			if(carro1.getPosicaoRelativa() >= 80|| carro2.getPosicaoRelativa()>= 80)
				isCorrendo = false;
		}

		if(carro1.getPosicaoRelativa()>carro2.getPosicaoRelativa()) {
			System.out.println("                                                                       Carro 1 vencedor!!!");
		} else if(carro1.getPosicaoRelativa()==carro2.getPosicaoRelativa()) {
			System.out.println("                                                                       Empate!!!");
		}
		else {
			System.out.println("                                                                       Carro 2 vencedor!!!");
		}

	}

}
