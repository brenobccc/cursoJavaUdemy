package secao9;

public class ProdutoSobreCarga {
	public String nome;
	public double price;
	public int quantity;
	
	
	public ProdutoSobreCarga(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.price = preco;
		this.quantity = quantidade;
	}	
	
	public ProdutoSobreCarga(String nome, double price) {
		this.nome = nome;
		this.price = price;
		//quantity = 0;
	}
}
