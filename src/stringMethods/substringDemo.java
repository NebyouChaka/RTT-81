package stringMethods;

public class substringDemo {
	  public static void main(String[] args) {
		  
		  
		    String str1 = "java is fun";
		    String string = "This is a string";
		    
		    String sub = string.substring(5, 7);
		    // extract substring from index 0 to 3
		    System.out.println(str1.substring(0, 4));
		    System.out.println(sub);
		    
		    //substring with just a start
		    
		    String sub1 = string.substring(5);
		    System.out.println(sub1);
		    
		    //-----------------0123456789123
		    String filename = "someimage.jpg";
		    
		    int lastDot = filename.lastIndexOf(".");
		    
		    String ext = filename.substring(filename.lastIndexOf(".") + 1);
		    System.out.println(ext);
		    
		  //-----------------0123456789123
		  String name = "Eric Heilig";
		  
		  int spacePosition = name.indexOf(" ");
		  
		  String firstname = name.substring(0, name.indexOf(" "));
		  System.out.println(firstname);
		  
		  String lastname = name.substring(name.indexOf(" ") + 1);
		  System.out.println(lastname);

		  }
}
