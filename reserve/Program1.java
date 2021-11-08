package reserve;

import java.util.Locale;
import java.util.Scanner;

public class Program1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = teclado.nextLine();
		System.out.print("Price: ");
		double price = teclado.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = teclado.nextInt();
		Product1 product = new Product1(name, price, quantity);
		
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200.00);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = teclado.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock: ");
		int quantity1 = teclado.nextInt();
		product.removeProducts(quantity1);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		teclado.close();
	}
}
