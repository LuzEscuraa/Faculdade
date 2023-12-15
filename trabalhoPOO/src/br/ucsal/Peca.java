package br.ucsal;

public abstract class Peca {

	private String descricao;
	private int quantidade;
	private int estoqueMinimo;
	private int estoqueMaximo;
	
	//CONSTRUTOR
	public Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}
	
	
	
	
	//METODO REPOSICAO DE ESTOQUE DA PECA
	public void reposicaoEstoque() {
		if(this.getQuantidade() < this.getEstoqueMaximo()) {
			this.setQuantidade(this.estoqueMaximo);
			System.out.println("Estoque atualizado!");
		} else {
			System.out.println("Estoque = " + this.quantidade);
			System.out.println("Ainda não é necessário repor o estoque");
		}
	}
	
	
	
	//MÉTODO ABSTRATO DE VENDA
	public abstract void venda();

	
	//GETTERS E SETTERS
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}
	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}
	public int getEstoqueMaximo() {
		return estoqueMaximo;
	}
	public void setEstoqueMaximo(int estoqueMaximo) {
		this.estoqueMaximo = estoqueMaximo;
	}
}