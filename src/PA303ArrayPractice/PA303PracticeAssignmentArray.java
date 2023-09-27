package PA303ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class PA303PracticeAssignmentArray {

	public static void main(String[] args) {
	 
		//Task 1: Write a program that creates an array of integers with a length of 3. Assign the values 1, 2, and 3 to the indexes. Print out each array element.
		
		int[] arr = new int[3];
		  arr[0] = 1;
		  arr[1] = 2;
		  arr[2] = 3;
		  
		 for(int i = 0; i < arr.length; i++) {
			  System.out.println("Element at index " + i + ": " + arr[i]);
		  }
		
		//Task 2: Write a program that returns the middle element in an array. Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7

		 int[] myArray = {13, 5, 7, 68, 2};
		 
		 if (myArray.length % 2 != 0) {
	            int middleIndex = myArray.length / 2;
	            int middleElement = myArray[middleIndex];
	            System.out.println("Middle Element: " + middleElement);
	        } else {
	            System.out.println("Array length is even, no middle element.");
	        }
		 
		 
		 //Task 3: Write a program that creates an array of String type and initializes it with the strings 
		 //“red,” “green,” “blue,” and “yellow.” Print out the array length. Make a copy using the clone( ) method. 
		 //Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
		 
		 String[] colors = {"red", "green", "blue", "yellow"};

	        // Print the original array length
	        System.out.println("Original Array Length: " + colors.length);

	        // Create a copy of the original array using the clone() method
	        String[] copyColors = colors.clone();

	        // Verify that the original array was copied by printing the copy
	        System.out.println("Copy of the Array: " + Arrays.toString(copyColors));
		 
	        
	      //Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers. 
	      //Print out the value at the first index and the last index using length - 1 as the index.
	      //Now try printing the value at index = length (e.g., myArray[myArray.length] ).  
	      //Notice the type of exception which is produced. Now try to assign a value to the array index 5. You should get the same type of exception.
	        
	        int[] numbers = {1, 2, 3, 4, 5};

	        // Print the value at the first index (index 0)
	        System.out.println("Value at index 0: " + numbers[0]);

	        // Print the value at the last index (index 4)
	        System.out.println("Value at last index: " + numbers[numbers.length - 1]);

	        try {
	            // Attempt to print the value at index equal to the array's length (index 5)
	            System.out.println("Value at index length: " + numbers[numbers.length]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Exception caught: " + e);
	        }

	        try {
	            // Attempt to assign a value to index 5
	            numbers[5] = 6;
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Exception caught: " + e);
	        }
	        
	        
	        //Task 5: Write a program where you create an integer array with a length of 5. Loop through the array 
	        //and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
	        
	        int[] integerArray = new int[5];

	        for (int i = 0; i < integerArray.length; i++) {
	            integerArray[i] = i;
	        }

	        // Print the array elements
	        for (int i = 0; i < integerArray.length; i++) {
	            System.out.println("integerArray[" + i + "] = " + integerArray[i]);
	        }
	        
	        
	        //Task 6: Write a program where you create an integer array of 5 numbers. Loop through the array and 
	        //assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.
	        
	        int[] newArray = new int[5];

	        for (int i = 0; i < newArray.length; i++) {
	            newArray[i] = i * 2;
	        }

	        // Print the array elements
	        for (int i = 0; i < newArray.length; i++) {
	            System.out.println("newArray[" + i + "] = " + newArray[i]);
	        }
	        
	        
	        //Task 7: Write a program where you create an array of 5 elements. Loop through the array and print the value of each element, except for the middle (index 2) element.
	        
	        int[] customArray = {1, 2, 3, 4, 5};

	        for (int i = 0; i < customArray.length; i++) {
	            if (i != 2) { // Skip the middle element at index 2
	                System.out.println("customArray[" + i + "] = " + customArray[i]);
	            }
	        }
	        
	        //Task 8: Write a program that creates a String array of 5 elements and swaps the first element with the middle element without creating a new array.
	        
	        
	        String[] stringArray = {"A", "B", "C", "D", "E"};

	        // Swap the first element with the middle element
	        int middleIndex = stringArray.length / 2;

	        String temp = stringArray[0];
	        stringArray[0] = stringArray[middleIndex];
	        stringArray[middleIndex] = temp;

	        // Print the array to verify the swap
	        for (String element : stringArray) {
	            System.out.print(element + " ");
	        }
	        
	        
	       //Task 9: 
	       // Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order, 
	        //and print the smallest and the largest element of the array. The output will look like the following:
	        	//Array in ascending order: 0, 1, 2, 4, 9, 13
	        	//The smallest number is 0
	        	//The biggest number is 13 
 
	        
	        int[] intArray = {4, 2, 9, 13, 1, 0};

	        // Sort the array in ascending order
	        Arrays.sort(intArray);

	        // Print the sorted array
	        System.out.print("Array in ascending order: ");
	        for (int i = 0; i < intArray.length; i++) {
	            System.out.print(intArray[i]);
	            if (i < intArray.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println();

	        // Print the smallest and the largest elements
	        System.out.println("The smallest number is " + intArray[0]);
	        System.out.println("The biggest number is " + intArray[intArray.length - 1]);
	        
	        
	        //Task 10: Create an array that includes an integer, 3 strings, and 1 double. Print the array.
	        
	        
	        Object[] mixedArray = {42, "Hello", "World", "Java", 3.14};

	        // Print the array
	        System.out.print("Array with mixed types: [");
	        for (int i = 0; i < mixedArray.length; i++) {
	            System.out.print(mixedArray[i]);
	            if (i < mixedArray.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");

	        
	        
	        //Task 11: Write some Java code that asks the user how many favorite things they have. Based on their answer, 
	        //you should create a String array of the correct size. Then ask the user to enter the things and store them 
	        //in the array you created. Finally, print out the contents of the array.


			//Example
			//How many favorite things do you have?
			//7
			
			//Enter your thing: phone
    		//Enter your thing: tv
		    //Enter your thing: xbox
			//Enter your thing: wine
			//Enter your thing: beer
			//Enter your thing: sofa
			//Enter your thing: book
			//Your favorite  things are:
            //phone tv xbox wine beer sofa book
	        
	        Scanner scanner = new Scanner(System.in);

	        // Ask the user how many favorite things they have
	        System.out.print("How many favorite things do you have? ");
	        int numFavorites = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character

	        // Create a String array of the correct size
	        String[] favoriteThings = new String[numFavorites];

	        // Ask the user to enter their favorite things and store them in the array
	        for (int i = 0; i < numFavorites; i++) {
	            System.out.print("Enter your thing: ");
	            favoriteThings[i] = scanner.nextLine();
	        }

	        // Print out the contents of the array
	        System.out.println("Your favorite things are:");
	        for (String thing : favoriteThings) {
	            System.out.print(thing + " ");
	        }

	        // Close the scanner
	        scanner.close();
	        

	}

}
