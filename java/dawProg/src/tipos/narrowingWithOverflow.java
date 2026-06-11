package tipos;

public class narrowingWithOverflow {

	public static void main(String[] args) {
		int i = 130;
		// byte bint = i; // Type mismatch: cannot convert from int to byte
		byte b = (byte) i; // explicit casting, un int no cabe en un byte
		System.out.println("Valor de b: " + b);
		System.out.println("Valor de i: " + i);
	}
}
// explicit casting = narrowing
// data loss, overflow