package arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int arraySize = 10;

		// this creates a new array of type double with 20 elements ... 0 to 19
		double[] doubleArray = new double[arraySize];

		String[] stringArray = new String[arraySize];
		stringArray[1] = "one";
		stringArray[2] = "two";
		stringArray[0] = "zero";
		stringArray[9] = "nine";

		// this is going to fail and cause code execution to stop
		// stringArray[11] = "eleven";

		// loop over the entire array and print the value in each location
		// its important to know that you can ask an array how long it is using .length
		for (int pos = 0; pos < stringArray.length; pos++) {
			System.out.println("The value in position " + pos + " is " + stringArray[pos]);
		}

		System.out.println("=========================");

		// enhanced for loop
		for (String value : stringArray) {
			System.out.println("The value = " + value);
		}

		System.out.println("=========================");

		// write a for loop that counts the number of nulls in the array
		// after the loop completes print that number
		int nullCount = 0;
		for (String value : stringArray) {
			if (value == null) {
				nullCount = nullCount + 1;
			}
		}
		System.out.println("Number of nulls is " + nullCount);
		
		// write a for loop that tells me the location of the first null in the array
		
		// this is going to use the non-enhanced for loop
		int firstNull = -1;
		for (int pos = 0; pos < stringArray.length; pos++) {
			if ( stringArray[pos] == null ) {
				firstNull = pos;
				break;
			}
		}
		
		// write a for loop that tells me how many values are not null
		
		 int notNullCount = 0;
		 for (int pos = 0; pos < stringArray.length; pos++) {
			 if (stringArray[pos] != null) {
				 notNullCount = notNullCount + 1 ;
			 }
		 }
		 System.out.println("Number of null values in array is " + notNullCount);
		// write a for loop that tells me the last position of null in the array
		  int lastNullPositon = -1;
		 for (int pos = 0; pos < stringArray.length; pos++) {
			 if(stringArray[pos] == null) {
				 lastNullPositon = pos;
			 }
		 }
		 if (lastNullPositon != -1) {
	            System.out.println("The array doesnot have a null");
	        } else {
	            System.out.println("The last null of the array is in position " + lastNullPositon);
	        }
		 
		// write a for loop that starts at the final position in the array and counts down to the first
		
		  int firstPositon = -1;
			 for (int pos = 0; pos < stringArray.length; pos++) {
				 if(stringArray[pos] == null) {
					 firstPositon = pos;
				 }
			 }
			 System.out.println("Start from first position");
		String letters = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
		
		// use letters.split(",") to make an array of letters
		// loop over the array and count the number of letters that are not vowels
		
		 String[] letterstArray = letters.split(",");

	        int numberOfLetters = 0;

	        for (int pos =0; pos < letterstArray.length; pos++) {
	            if (letterstArray[pos].equals("a")){
	            continue;
	                
	         }else if (letterstArray[pos].equals("e")) {
	        	 continue;
	        	 
	        }else if (letterstArray[pos].equals("i")) {
	        	 continue;
	        	 
	        }else if (letterstArray[pos].equals("o")) {
	        	 continue;
	        	 
	        }else if (letterstArray[pos].equals("u")) {
	        	 continue;	 
	        }
	        System.out.println("Number of non-vowel letters: " + numberOfLetters);
		
		System.out.println("Position of the first null is " + firstNull);
	    }
	}
}
