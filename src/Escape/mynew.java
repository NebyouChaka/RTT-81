package Escape;

import java.util.ArrayList;
import java.util.List;

public class mynew {
	List<Product> products = new ArrayList<>();

	  public void setupProducts(){
	    Product coffee = new Product();
	    coffee.setName("Coffee");
	    coffee.setPrice(5.44);
	    products.add(coffee);

	    Product cookie = new Product();
	    cookie.setName("Cookie");
	    cookie.setPrice(5.44);
	    products.add(cookie);

	    Product sandwich = new Product();
	    sandwich.setName("Sandwich");
	    sandwich.setPrice(5.44);
	    sandwich.setLayer(5);
	    products.add(sandwich);
	  }
	  
	  public void printProduct(Product product) {
	    //System.out.println("Product name : " + product.getName() + " price : " + product.getPrice());
	    if ("Sandwich".equals(product.getName())) {
            System.out.println("Product name : " + product.getName() + " price : " + product.getPrice() + " Layer : " + product.getLayer());
        } else {
            System.out.println("Product name : " + product.getName() + " price : " + product.getPrice());
        }
	  }
	  public void printAllProducts() {
			for (Product product : products){
				printProduct(product);
			}
		}

	  public static void main(String[] args) {
		  mynew restuarnt = new mynew();

	    // Set up the products
		  restuarnt.setupProducts();

	    // Print all products
		  restuarnt.printAllProducts();
	  } 
}
