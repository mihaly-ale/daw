package types;

public class primitiveTypes {
	public static void main(String[] args) {
		byte x = 1;
		System.out.println("x: " + x); // 1

		byte y = x;
		x = 2;

		System.out.println("y: " + y); // 1
		System.out.println("x: " + x); // 2
	}
}
