package secao14_exercicio;

public class PessoaFisica extends Pessoa{
	private Double gastosComSaude;
	
	PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude){
		super(nome,rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}
	
	@Override
	public final Double calcularImposto() {
		/*TODO
		 * se a renda foi abaixo de 20000.00, pagam 15% de imposto
		 * se a renda for maior ou igual a 20000.00 pagam 25% de imposto
		 * se a pessoa teve gastos com saúde, 50% dos gastos são abatidos no imposto
		 * */
		final double QTD_IMPOSTO = ((this.rendaAnual >= 20000.00) ? (25.00) : (50.00))/100.00;
		
		if(gastosComSaude>0) {
			final double QTD_IMPOSTO_SAUDE = (50.00/100.00);
			return (this.rendaAnual * QTD_IMPOSTO) - (this.gastosComSaude * QTD_IMPOSTO_SAUDE);
		}
		
		return this.rendaAnual * QTD_IMPOSTO;
	}
}
