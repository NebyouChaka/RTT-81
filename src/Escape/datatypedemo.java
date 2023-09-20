package Escape;

public class datatypedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  byte num;   // This can hold whole number between -128 and 127.
	       num = 113;
	       System.out.println(num);


	       short snum;
	       snum = 150;
	       System.out.println(snum);


	       long lnum = -12332252626L;
	       System.out.println(lnum);


	       double dnum = -42937737.9d;
	       System.out.println(dnum);


	       float fnum = 19.98f;
	       System.out.println(fnum);


	       boolean b = false;
	       System.out.println(b);


	       char ch = 'Z';
	       System.out.println(ch);
	}

}
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        int intValue = scanner.nextInt();
        double doubleValue = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        String stringValue = scanner.nextLine();

        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);	