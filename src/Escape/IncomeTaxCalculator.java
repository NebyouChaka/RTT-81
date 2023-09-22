package Escape;

import java.util.Scanner;

public class IncomeTaxCalculator {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter their filing status
	        System.out.println("Choose your filing status:");
	        System.out.println("1 - Single");
	        System.out.println("2 - Married Filing Jointly");
	        System.out.println("3 - Married Filing Separately");
	        System.out.println("4 - Head of Household");
	        System.out.print("Enter the number corresponding to your filing status: ");

	        int filingStatus = scanner.nextInt();

	        // Prompt the user to enter their taxable income
	        System.out.print("Enter your taxable income: $");
	        double taxableIncome = scanner.nextDouble();

	        // Calculate the tax based on the selected filing status and income
	        double tax = calculateTax(filingStatus, taxableIncome);

	        // Display the calculated tax
	        System.out.println("Your estimated federal income tax is: $" + tax);

	        scanner.close();
	    }

	    public static double calculateTax(int filingStatus, double taxableIncome) {
	        double tax = 0.0;

	        switch (filingStatus) {
	            case 1: // Single
	                if (taxableIncome <= 8350) {
	                    tax = taxableIncome * 0.10;
	                } else if (taxableIncome <= 33950) {
	                    tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
	                } else if (taxableIncome <= 82250) {
	                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
	                } else if (taxableIncome <= 171550) {
	                    // Add more tax brackets and calculations as needed
	                    // For 2009, you can find the tax brackets and rates online
	                } else {
	                    // Handle higher income ranges
	                }
	                break;

	            default:
	                System.out.println("Invalid filing status.");
	        }

	        return tax;
	    }

}
