package Escape;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class CoffeShop {

		List<Product> products = new ArrayList<>();
		
		List<Product> order = new ArrayList<>();
		
		
		Scanner input = new Scanner(System.in);
	public void setupProducts() {
		Product coffee = new Product();
		coffee.setName("Coffee");
		coffee.setPrice(5.44);
		products.add(coffee);
		
		Product tea = new Product();
		tea.setName("Tea");
		tea.setPrice(4.33);
		products.add(tea);
		
		Product cookie = new Product();
		cookie.setName("Cookie");
		cookie.setPrice(6.77);
		products.add(cookie);
		
		Product sandwich = new Product();
		cookie.setName("Egg & Cheese Mufine");
		cookie.setPrice(19.99);
		products.add(sandwich);
		
//		printProduct(coffee);
//		printProduct(tea);
//		printProduct(cookie);
		printAllProducts();
	}
	public void printProduct(Product product) {
		// TODO HOMEWORK : Change this print only the product name + tab + price with a
		 System.out.println("Product name: " + product.getName() + "\tPrice: $" + product.getPrice());
		//System.out.println("Product name : " + product.getName() + " price : " + product.getPrice());
	}
	public void printAllProducts() {
		for (Product product : products){
			printProduct(product);
		}
	}
	
	public void example() {
	
		double coffee = 5.43;
		double tea = 4.33;
		double cookie = 6.76;
		
		double subTotal = 0;
		subTotal = coffee * 3;
		subTotal = subTotal + (tea * 4);
		subTotal = subTotal + (cookie * 2);
		System.out.println("Subtotal : " + subTotal);
		
		DecimalFormat df = new DecimalFormat("$#,###.00");
		System.out.println("Subtotal\t " + df.format(subTotal));
		
		double salesTax = subTotal * 0.10;
		System.out.println("sales Tax\t " + df.format(salesTax));
		
		double totalSale = subTotal + salesTax;
		System.out.println("Total\t\t " + df.format(totalSale));
}
	public int displayMainUserMenu(){
		System.out.print("1) Print the menu items and prices");
		System.out.print("2) Add an item to your order");
		System.out.print("3) Print the items in your order");
		System.out.print("4) Checkout");
		System.out.println("5) Exit");
		
		System.out.print("\nWhat do you want to do? ");
		int select = input.nextInt();
		input.nextLine();
		
		return select;
	}
	public void userSelectProduct() {
		System.out.println("Enter product name to order: ");
		String orderSelection = input.nextLine();
		
		for (Product product : products) {
			if(product.getName().equalsIgnoreCase(orderSelection)) {
				order.add(product);
				System.out.println("added" + product.getName() + "to your order.");
			}
		}
	}
	public void displayOrderList() {
	    System.out.println("Products in your order:");
	    for (Product product : order) {
	        System.out.println("Product name: " + product.getName() + "\tPrice: $" + product.getPrice());
	    }
	}
	
	public static void main(String[] args) {
		CoffeShop cf = new CoffeShop();
        cf.setupProducts();
        
        while (true) {
			int userSelection = cf.displayMainUserMenu();
			
			if (userSelection == 1) {
				cf.printAllProducts();
			} else if (userSelection == 2) {
				cf.userSelectProduct();
			} else if (userSelection == 3 ) {
				// TODO HOMEWOK - display the products in the order list here
				cf.displayOrderList();
			} else if ( userSelection == 5) {
				System.exit(0);
			} else {
				System.out.println("User input " + userSelection + " is unknonw.   Try again;");
		}
	}
	}
}
