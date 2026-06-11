package arrays;

public class stringArrays {

	public static void main(String[] args) {

		System.out.println("\"String[] sVector = new String[4];\"");
		String[] sVector = new String[4];
		for (int i = 0; i < sVector.length; i++) {
			System.out.print(sVector[i] + " ");
		}

		System.out.println("\n\n\"String[] ssVector = {\"Manzana\", \"Peras\", \"Naranjas\"}\"");
		String[] ssVector = { "Manzana", "Peras", "Naranjas" };
		for (int i = 0; i < ssVector.length; i++) { // bucle for normal
			System.out.print(" " + ssVector[i] + "  ");
		}

		System.out.println("\n\n\"ssVector[2] = \"Kiwi\"");
		ssVector[2] = "Kiwi";

		System.out.println("\n\"for (String fruta : ssVector)\"");
		for (String fruta : ssVector) { // for each
			System.out.println(" fruta = " + fruta);
		}

	}

}
