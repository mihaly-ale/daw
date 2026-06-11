package bucles;

public class forSimple {

	public static void main(String[] args) {

		int sumai = 0;

		for (int i = 0; i <= 3; i++) {
			System.out.println("i:" + i);
			sumai = sumai + i;
			System.out.println("sumai:" + sumai);
			System.out.println("---------------");
		}
		System.out.println("sumai al final: " + sumai);
		
		// System.out.println("i: " + i);
		// Error, i es un variable del bucle, tiene ámbito local, no se puede ver afuera
	}

}
