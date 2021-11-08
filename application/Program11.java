package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program11 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("how many products do you want to register? ");
		int qtd = sc.nextInt();
		
		for(int i=1; i<=qtd; i++) {
			System.out.println("product #" + i);
			System.out.println("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Price: ");
			double price = sc.nextDouble();
			if(ch == 'i') {
				System.out.println("Customs fee: ");
				double fee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, fee));
			}else if(ch == 'c') {
				list.add(new Product(name, price));
			}else if(ch == 'u') {
				System.out.println("Manufactured date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
				}
		}
		
		System.out.println();
		System.out.println("price TAGS: ");
		
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}
		sc.close();
	}
}
