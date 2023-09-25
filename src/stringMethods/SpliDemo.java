package stringMethods;

import java.util.Arrays;

public class SpliDemo {

	  public static void main(String[] args) {
		    String vowels = "a::b::c::d:e";

		    // splitting the string at "::"
		    // storing the result in an array of strings
		    String[] result = vowels.split("::");

		    // converting array to string and printing it
		    System.out.println("result = " + Arrays.toString(result));
		    
		    String csv = "a,b,c,d,e,f,g,h,i,j,k";
		    String[] commas = csv.split(",");
		    System.out.println("result = " + Arrays.toString(commas));
		    
		    String name = "Firstname Lastname";
		    String[] names = name.split(" ");
		    System.out.println("result = " + Arrays.toString(names));
		  }
}
