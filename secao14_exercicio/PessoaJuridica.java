package secao14_exercicio;

public class PessoaJuridica extends Pessoa{
	private int numeroDeFuncionarios;
	
	PessoaJuridica(String nome, Double rendaAnual, int numFunc){
		super(nome,rendaAnual);
		this.numeroDeFuncionarios = numFunc;
	}
	
	@Override
	public final Double calcularImposto() {
		/*TODO
		 * pessoa jurídicas pagam 16% de imposto.
		 * se a empresa possuir mais de 10 funcionarios, ela paga 14% de imposto
		 * */
		final double QTD_IMPOSTO = this.numeroDeFuncionarios > 10 ? (14.00/100.00) : (16.00/100.00);
		return this.rendaAnual * QTD_IMPOSTO;
	}
}
