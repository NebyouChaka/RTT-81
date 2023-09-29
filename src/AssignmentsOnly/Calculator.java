package AssignmentsOnly;

import java.util.Scanner;

public class Calculator {

	// this one is good to learn how to code for the purpose of learning about operators!!!!
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double num1, num2, result;

	        System.out.print("Enter the first number: ");
	        num1 = getInput(scanner);
	        
	        System.out.print("Enter the second number: ");
	        num2 = getInput(scanner);

	        int choice = showMenu(scanner);

	        switch (choice) {
	            case 1:
	                result = add(num1, num2);
	                System.out.println("Result of addition: " + result);
	                break;
	            case 2:
	                result = subtract(num1, num2);
	                System.out.println("Result of subtraction: " + result);
	                break;
	            case 3:
	                result = multiply(num1, num2);
	                System.out.println("Result of multiplication: " + result);
	                break;
	            case 4:
	                if (num2 != 0) {
	                    result = divide(num1, num2);
	                    System.out.println("Result of division: " + result);
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                }
	                break;
	            default:
	                System.out.println("Invalid choice.");
	        }

	        scanner.close();
	    }

	    public static double getInput(Scanner scanner) {
	        return scanner.nextDouble();
	    }

	    public static int showMenu(Scanner scanner) {
	        System.out.println("Calculator Menu:");
	        System.out.println("1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Multiplication");
	        System.out.println("4. Division");
	        System.out.print("Enter your choice (1/2/3/4): ");
	        return scanner.nextInt();
	    }

	    public static double add(double num1, double num2) {
	        return num1 + num2;
	    }

	    public static double subtract(double num1, double num2) {
	        return num1 - num2;
	    }

	    public static double multiply(double num1, double num2) {
	        return num1 * num2;
	    }

	    public static double divide(double num1, double num2) {
	        return num1 / num2;
	    }

  
}
