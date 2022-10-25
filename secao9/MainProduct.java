package secao9;

public class MainProduct {

	public static void main(String[] args) {
				
		Product product = new Product("Breno",50.0,150);
		
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		System.out.println(product.getQuantity());
	}

}
