package Escape;

public class ConditionalOperation {
	public static void main(String[] args) {
		boolean conditionOne = false;
		boolean conditionTwo = false;
		//&& is and
		if(conditionOne && conditionTwo) {
			//do something only if both variable are true
			System.out.println("Both variable are true");
		}
		//|| is or
		if(conditionOne || conditionTwo ) {
			//do something if one or the other or both variable are true
			System.out.println("Either or both of the variable is true");
		}
		//this is using mathmatical operation
		int x = 10;
		if ((x > 3) && ( x < 20)) {
			System.out.println("x is between 3 and 20");
		}
		//odd vs even
		int y = 4;
		if ( (y % 2) == 1) {
			System.out.println("This is odd number");
		} else {
			System.out.println("This is even number");
		}
}
}
