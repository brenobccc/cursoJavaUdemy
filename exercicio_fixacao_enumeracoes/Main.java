package exercicio_fixacao_enumeracoes;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name,email,birthDate;
		String status;
		int qtyItemsOrder;
		try {
			System.out.println("Enter cliente data:");
			System.out.print("Name: ");
			
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Birth Date (DD/MM/YYYY): ");
			birthDate = sc.next();
			
			System.out.println("Enter order data:");
			System.out.print("Status: ");
			
			status = sc.next();
			System.out.print("How many items to this order? ");
			qtyItemsOrder = sc.nextInt();
			
			Order order = new Order();
			
			Client cliente = new Client();
			cliente.setName(name);
			cliente.setEmail(email);
			String[] datas = birthDate.split("/");
			Calendar date = Calendar.getInstance();
			date.set(Calendar.DAY_OF_MONTH, Integer.parseInt(datas[0]));
			date.set(Calendar.MONTH, Integer.parseInt(datas[1]));
			date.set(Calendar.DAY_OF_MONTH, Integer.parseInt(datas[0]));
			cliente.setBirthDate(date);
			
			order.setClient(cliente);
			order.setStatus(OrderStatus.valueOf(status));
		
			for(int i = 0; i<qtyItemsOrder; i++) {
				sc.nextLine();
				System.out.println("Enter #"+(i+1)+" item data: ");
				OrderItem orderItem = new OrderItem();
				System.out.print("Product name: ");
				String productName = sc.nextLine();
				System.out.print("Product price: ");
				Double productPrice = sc.nextDouble();
				System.out.print("Quantity: ");
				int productsQty = sc.nextInt();
				
				orderItem.setQuantity(productsQty);
				
				Product produto = new Product();
				produto.setName(productName);
				produto.setPrice(productPrice);
				
				orderItem.setProduct(produto);
				
				orderItem.subTotal();
				order.addItem(orderItem);
			}
			
			System.out.println("ORDER SUMMARY");
			System.out.print("Order moment:"+order.getMoment()+"\n");
			System.out.print("Order status:"+order.getStatus()+"\n");
			System.out.print("Client:"+order.getClient().getName() + " " + order.getClient().getEmail());
			
			System.out.println("Order Items:");
			
			double somatorioValores = 0.0;
			for(int j=0; j < order.getOrderItem().size(); j++) {
				System.out.print(order.getOrderItem().get(j).getProduct().getName());
				System.out.print(", "+order.getOrderItem().get(j).getProduct().getPrice());
				System.out.print(" Quantity: "+order.getOrderItem().get(j).getQuantity());
				System.out.print(" Subtotal: "+order.getOrderItem().get(j).getPrice()+"\n");
				somatorioValores+=order.getOrderItem().get(j).getPrice();
			}
			
			System.out.printf("Total Price: %.2f",somatorioValores);
				
			
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
}
