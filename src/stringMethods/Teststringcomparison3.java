package stringMethods;

public class Teststringcomparison3 {
	  public static void main(String args[]){
		  
//		  Suppose s1 and s2 are two String objects. If:
//			  s1 == s2 : The method returns 0.
//			  s1 > s2 : The method returns a positive value.
//			  s1 < s2 : The method returns a negative value.
//			  Create a class named Teststringcomparison4.java and write the code below to it.
			  
			  
	       String s1="Perscholas";
	       String s2="Perscholas";
	       String s3="Perschola";
	       String s4="PerscholasX";
	       System.out.println(s1.compareTo(s2)); //0
	       System.out.println(s1.compareTo(s3)); // 1(because s1>s3)
	       System.out.println(s1.compareTo(s4)); // -1(because s1<s4 )
	   }

}
