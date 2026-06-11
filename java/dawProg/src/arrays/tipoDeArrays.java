package arrays;

public class tipoDeArrays {
	static String red = "\u001B[31m";
	static String reset = "\u001B[0m";

	public static void main(String[] args) {

		System.out.println("\"float fVector[] = new float[4]\"");
		float fVector[] = new float[4]; // manera compacto para iniciliazar en una línea con tipo de float
		for (int i = 0; i < 4; i++) {
			System.out.print(fVector[i] + "  ");
		}

		System.out.println("\n\n\"double dVector[] = {3, 2.876, 1.6543, 0}\"");
		double dVector[] = { 3, 2.876, 1.6543, 0 }; // en esta forma solo puede ser en un alínea
		for (int i = 0; i < 4; i++) {
			System.out.print(dVector[i] + "  ");
		}

		System.out.println("\n\n\"boolean[] bVector = {false, true, true}\"");
		boolean[] bVector = { false, true, true };
		for (int i = 0; i < 4; i++) {
//			System.out.print(bVector[i] + " "); // ERROR
			// java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		}

		System.out.println("\n\n\"for (int i = 0; i < bVector." + red + "length" + reset + "; i++)\"");
		try {
			for (int i = 0; i < bVector.length; i++)
				System.out.print(bVector[i] + "  ");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
