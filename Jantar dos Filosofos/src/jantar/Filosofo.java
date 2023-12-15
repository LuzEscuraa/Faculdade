package jantar;

import jantar.Mesa;

public class Filosofo extends Thread{
	final static int TEMPO_MAX = 100;
	Mesa mesa;
	int filosofo;

	public Filosofo(String nome, Mesa mesadejantar, int fil) {
		super(nome);
		mesa = mesadejantar;
		filosofo = fil;
	}
	public void run() {
		int tempo = 0;
		while(true){
			tempo = (int) (Math.random() * TEMPO_MAX);
			pensar(tempo);
			pegarGarfos();
			tempo = (int) (Math.random() * TEMPO_MAX);
			comer(tempo);
			returningGarfos();
		}
	}

	public void pensar (int tempo) {
		try {
			sleep(tempo);
		}
		catch (InterruptedException e) {
			System.out.println("O Filósofo pensou demais");
		}

	}
	public void comer (int tempo) {
		try {
			sleep(tempo);
		}
		catch (InterruptedException e) {
			System.out.println("O Filósofo comeu demais");
		}
	}
}

