package jantar;



public class Mesa{
	final static int PENSANDO = 1;
	final static int COMENDO = 2;
	final static int FOME = 3;
	final static int NR_FILOSOFOS = 5;
	final static int PRIMEIRO_FILOSOFO = 0;
	final static int ULTIMO_FILOSOFO = NR_FILOSOFOS - 1;
	boolean[] garfos = new boolean[NR_FILOSOFOS];
	int[] filosofos = new int[NR_FILOSOFOS];
	int[] tentativas = new int[NR_FILOSOFOS];

	public Mesa() {
		for (int i = 0; i < 5; i++) {
			garfos[i] = true;
			filosofos[i] = PENSANDO;
			tentativas[i] = 0;


		}
	}
	
	public synchronized void pegarGarfos (int filosofo) {
		filosofos[filosofo] = FOME;
		while (filosofos[aEsquerda(filosofo)] == COMENDO || filosofos[aDireita(filosofo)] == COMENDO) {
			try {
				tentativas[filosofo]++;
				wait();
			}
			catch (InterruptedException e) {	
			}
		}
		System.out.println("O Fil�sofo morreu devido a starvation");
		tentativas[filosofo] = 0;
		garfos[garfoEsq(filosofo)] = false;
		garfos[garfoDir(filosofo)] = false;
		filosofos[filosofo] = COMENDO;
		imprimeEstadosFilosofos();
		imprimeGarfos();
		imprimeTentativas();
	}
	public synchronized void returningGarfos (int filosofo)
	{
		garfos[garfoEsq(filosofo)] = true;
		garfos[garfoDir(filosofo)] = true;
		if (filosofos[aEsquerda(filosofo)] == FOME || filosofos[aDireita(filosofo)] == FOME)
		{
			notifyAll();
		}
		filosofos[filosofo] = PENSANDO;
		imprimeEstadosFilosofos();
		imprimeGarfos();
		imprimeTentativas();
	}
	public int aEsquerda(int filosofo) {
		int esquerdo;
		if (filosofo == PRIMEIRO_FILOSOFO) {
			esquerdo = ULTIMO_FILOSOFO;
		}else {
			esquerdo = filosofo - 1;
		}
		return esquerdo;
	}
	public int aDireita(int filosofo) {
		int direito;
		if (filosofo == PRIMEIRO_FILOSOFO) {
			direito = ULTIMO_FILOSOFO;
		}else {
			direito = filosofo - 1;
		}
		return direito;
	}
	public int garfoEsq (int filosofo) {
		int garfoEsq = filosofo;
		return garfoEsq;
	}
	public int garfoDir (int filosofo) {
		int garfoDir;
		if (filosofo == ULTIMO_FILOSOFO) {
			garfoDir = 0;
		}else {
			garfoDir = filosofo + 1;
		}
		return garfoDir;
	}
	public void imprimeEstadosFilosofos ()
	{
		String texto = "*";
		System.out.print("Fil�sofos = [ ");
		for (int i = 0; i < NR_FILOSOFOS; i++)
		{
			switch (filosofos[i])
			{
			case PENSANDO :
				texto = "PENSANDO";
				break;
			case FOME :
				texto = "FOME";
				break;
			case COMENDO :
				texto = "COMENDO";
				break;
			}
			System.out.print(texto + " ");
		}
		System.out.println("]");
	}
	public void imprimeGarfos ()
	{
		String garfo = "*";
		System.out.print("Garfos = [ ");
		for (int i = 0; i < NR_FILOSOFOS; i++)
		{
			if (garfos[i])
			{
				garfo = "LIVRE";
			}
			else
			{
				garfo = "OCUPADO";
			}
			System.out.print(garfo + " ");
		}
		System.out.println("]");
	}
	public void imprimeTentativas ()
	{
		System.out.print("Tentou comer = [ ");
		for (int i = 0; i < NR_FILOSOFOS; i++)
		{
			System.out.print(filosofos[i] + " ");
		}
		System.out.println("]");
	}
}