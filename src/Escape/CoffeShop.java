package Escape;
import java.util.List;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class CoffeShop {

		List<Product> product = new ArrayList<>();
	public void setupProducts() {
		Product coffee = new Product();
		coffee.setName("Coffee");
		coffee.setPrice(5.44);
		System.out.println("product name : " + coffee.getName() + " price : " + coffee.getPrice());
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
