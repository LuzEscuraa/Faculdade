package br.ucsal;

public class RoupaTamanhoUnico extends Peca{

	public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void venda() {
		setQuantidade(getQuantidade()-1);
		// TODO Auto-generated method stub
	}

}
