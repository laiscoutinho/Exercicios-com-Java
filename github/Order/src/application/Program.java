package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("name: ");
		String name = sc.nextLine();
		System.out.print("email: ");
		String email = sc.next();
		System.out.print("birth date: ");
		Date birthDate = sdf1.parse(sc.next()); 
		Client c1 = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		Order order = new Order(new Date(), status, c1);
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("enter #" + i + " item data");
			System.out.print("product name:: ");
			sc.nextLine(); //consumir
			String pName = sc.nextLine();
			System.out.print("product price: ");
			double price = sc.nextDouble();
			System.out.print("quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(pName, price);
			OrderItem oi= new OrderItem(quantity, price, product);
			
			order.addItem(oi);
		}
		
		System.out.println("\nORDER SUMARY:: ");
		System.out.print(order);
		
		sc.close();
	}

}
