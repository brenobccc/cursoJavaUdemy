package secao14_exercicio;

public abstract class Pessoa {
	protected String nome;
	protected Double rendaAnual;
	
	Pessoa(String nome, Double rendaAnual){
		this.nome = nome;
		this.rendaAnual  = rendaAnual;
	}
	
	public abstract Double calcularImposto();
}
