package bucles;

public class forConAmbito {

	public static void main(String[] args) {

		int j, sumaj = 0;

		for (j = 0; j <= 3; j++) {
			System.out.println("j:" + j);
			sumaj = sumaj + j;
		}

		System.out.println("Sumaj: " + sumaj);
		System.out.println("j: " + j); 
		// se puede ver j afuera el bucle, porque se declaró en el ámbito de class
		
	} //main
} //class
