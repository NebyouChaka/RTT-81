package stringMethods;

public class DemoReplaceAll {
//	The replaceAll() method replaces each substring that matches the regex of the string with the specified text.
//	The syntax of the replaceAll() method is:
	String str1 = "Java123is456fun";{

    // regex for sequence of digits
    String regex = "\\d+";

    // replace all occurrences of numeric
    // digits by a space
    System.out.println(str1.replaceAll(regex, " "));
  }

}
