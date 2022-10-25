package exercicio_fixacao_enumeracoes;

public enum OrderStatus {
	PENDING_PAYMENT(0), PROCESSING(1), SHIPPED(2), DELIVERED(3);
	
	private final int valor;
	OrderStatus(int valorOp){
		valor = valorOp;
	}
	
	public int getVl() {
		return valor;
	}
}
