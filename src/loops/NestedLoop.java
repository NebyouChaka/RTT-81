package loops;

public class NestedLoop {

	public static void main(String[] arg) {
		
		for (int outer = 1; outer <= 10; outer++) {
		    for (int inner = 1; inner <= outer; inner++) {
		        System.out.println("X");
		    }
		    System.out.println("\n");
		}
  }
}
