package br.ucsal;

public class RoupaPMG {

	private String descricao;
	private int quantidadeP;
	private int quantidadeM;
	private int quantidadeG;
	private int estoqueMinimo;
	private int estoqueMaximo;
	
	
	
	//MÉTODO CONSTRUTOR ROUPA PMG
	public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo, int estoqueMaximo) {
		this.descricao = descricao;
		this.quantidadeP = quantidadeP;
		this.quantidadeM = quantidadeM;
		this.quantidadeG = quantidadeG;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}
	
	
	
	//MÉTODO P REPOR ESTOQUE P,M E G
	public void reposicaoEstoque() {
		if(this.getQuantidadeP() < this.getEstoqueMinimo()){
			this.setQuantidadeP(estoqueMaximo);
			System.out.println("Valor de estoque 'P' atualizado.");
		}
		if(this.getQuantidadeM() < this.getEstoqueMinimo()){
			this.setQuantidadeM(estoqueMaximo);
			System.out.println("Valor de estoque 'M' atualizado.");
		}
		if(this.getQuantidadeG() < this.getEstoqueMinimo()){
			this.setQuantidadeG(estoqueMaximo);
			System.out.println("Valor de estoque 'G' atualizado.");
		}
	} 
	
	
	
	//MÉTODO P REPOR ESTOQUE DE UM TAMANHO ESPECÍFICO
	public void reposicaoEstoque(String tam) {
		if(tam.equalsIgnoreCase("p")) {
			if(this.getQuantidadeP() < this.getEstoqueMinimo()){ 
				this.setQuantidadeP(estoqueMaximo);
				System.out.println("Valor de estoque 'P' atualizado.");
			}
		} else if(tam.equalsIgnoreCase("m")) {
			if(this.getQuantidadeM() < this.getEstoqueMinimo()){
				this.setQuantidadeM(estoqueMaximo);
				System.out.println("Valor de estoque 'M' atualizado.");
			}
		} else if(tam.equalsIgnoreCase("g")) {
			if(this.getQuantidadeG() < this.getEstoqueMinimo()){
				this.setQuantidadeG(estoqueMaximo);
				System.out.println("Valor de estoque 'G' atualizado.");
			}
		}
		//NECESSÁRIO TROCAR ESSE ELSE POR TRATAMENTO DE EXCESSÃO!!!!!
		else { 	
			System.out.println("Tamanho inválido");
		}
	}
	
	
	
	//GETTERS E SETTERS
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidadeP() {
		return quantidadeP;
	}
	public void setQuantidadeP(int quantidadeP) {
		this.quantidadeP = quantidadeP;
	}
	public int getQuantidadeM() {
		return quantidadeM;
	}
	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}
	public void setEstoqueMaximo(int estoqueMaximo) {
		this.estoqueMaximo = estoqueMaximo;
	}
	public void setQuantidadeM(int quantidadeM) {
		this.quantidadeM = quantidadeM;
	}
	public int getQuantidadeG() {
		return quantidadeG;
	}
	public void setQuantidadeG(int quantidadeG) {
		this.quantidadeG = quantidadeG;
	}
	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}
	public int getEstoqueMaximo() {
		return estoqueMaximo;
	}
	
	
	

}

