package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("\nName: ");
		product.name = sc.nextLine();
		System.out.print("\nPrice: ");
		product.price = sc.nextDouble();
		System.out.print("\nQuantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println("\nProduct data: " + product.toString());
		
		System.out.println("\nEnter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("\nUpdate data: " + product.toString());
		
		System.out.println("\nEnter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("\nUpdate data: " + product.toString());		
		
		sc.close();
	}

}
