package OCarro;


public class Carro {
	private int posicao = 0;
	private int velocidade = 0;
	private int posicaoRelativa = posicao + velocidade;
	
	public int getPosicao() {
		return posicao;
	} 
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public int getPosicaoRelativa() {
		return posicaoRelativa;
	}
	public void setPosicaoRelativa(int posicaoRelativa) {
		this.posicaoRelativa = posicaoRelativa;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public void atualizarPosiRes() {
		this.posicaoRelativa = posicao + velocidade;
		
	}
	



}











