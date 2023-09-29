package stringMethods;

public class StringBufferExample {

	public static void main(String[] args) {
	
		// change to abc123xyz
		String x = "abcxyz";
		
		String x1 =x.substring(0, 3) + "123" + x.substring(3);
		
			System.out.println(x1);
			
		String y = x.toUpperCase();
		
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("abc");
		buffer.append("xyz");
		
		buffer.reverse();
		
		System.out.println(buffer.substring(0, 3));
		
		
		//you can insert into the string buffer anywhere
		buffer.insert(3,  "123");
		
		//remove from string buffer
		
		buffer.delete(3, 6);
		
		//replace some character in the string buffer.
		
		StringBuffer sT = new StringBuffer("Java");
		sT.replace(0,  2, "Hello");
		System.out.println(sT);

	}

}
