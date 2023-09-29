package PA303ArrayPractice;

public class SubstringAssignment {

	public static void main(String[] args) {
		
		
        // find the position of the first space in the string
           String text2 = "This is a sample text with spaces";

           int firstSpacePosition = text2.indexOf(' ');

           if (firstSpacePosition != -1) {
               System.out.println("The first space is at position: " + firstSpacePosition);
           } else {
               System.out.println("No space found in the string.");
           }
       
   		
           
           
   		// find the position of the last space in the string
         
           int lastSpacePosition = text2.lastIndexOf(' ');

           if (lastSpacePosition != -1) {
               System.out.println("The last space is at position: " + lastSpacePosition);
           } else {
               System.out.println("No space found in the string.");
           }
       
           
           
   		// substring of the characters between the first and last space of the string
   		
          if(firstSpacePosition != -1 && lastSpacePosition != -1 && firstSpacePosition != lastSpacePosition ) {
        	 
			String resultSubstring = text2.substring(firstSpacePosition + 1, lastSpacePosition);  
          
   		 System.out.println("the characters between the first and last space: " + resultSubstring);
   		 
          } else {
              System.out.println("No valid substring found between the first and last space.");
          }
          
          
          
          
   		// do the same thing to find the substring of the first and last vowel of the string
   	    // use the string.charAt function and use a for loop to loop over the entire string
   		// and print out each character with a new line after it.
   		// you need to use the string.length() function also 
        // using only indexOf(" ") print the substring that contains the word "is"
   		// use 2 substrings to do this.  
          
          
          String text1 = "Hello, World!";
          text1 = text1.toLowerCase();

          String firstVowel = null;
          String lastVowel = null;

          // Find the position of the first vowel
          for (int i = 0; i < text1.length(); i++) {
              char currentChar = text1.charAt(i);
              if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                  firstVowel = String.valueOf(currentChar);
                  break; 
              }
          }

          // Find the position of the last vowel
          for (int i = text1.length() - 1; i >= 0; i--) {
              char currentChar = text1.charAt(i);
              if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                  lastVowel = String.valueOf(currentChar);
                  break; 
              }
          }

          if (firstVowel != null && lastVowel != null) {
              String substring = text1.substring(text1.indexOf(firstVowel), text1.lastIndexOf(lastVowel) + 1);
              System.out.println("Substring of first and last vowels: " + " is " + substring);
          } else {
              System.out.println("No vowels found in the string.");
          }

	}

}
