package Escape;

import java.util.Scanner;

public class ScannerExamples2 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			  // create an Object of Scanner class
		    Scanner input = new Scanner(System.in);
		    System.out.print(" ");
		    // read input(line of text) from the keyboard
		    String name = input.nextLine();
		    //String name = input.next();
		    // prints the name
		    System.out.println("My name is " + name);
		    // closes the scanner
		    input.close();

		}

}
