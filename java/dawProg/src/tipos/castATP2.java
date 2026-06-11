package tipos;

public class castATP2 {
	public static void main(String[] args) {
		
		short a =2, b=3, c;
		// c = a + b; // => ERROR
		// Type mismatch: cannot convert from int to byte
		
		c = (short) (a + b);
		
		System.out.println(c); // 5
	}
}
