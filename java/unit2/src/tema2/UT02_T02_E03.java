package tema2;

public class UT02_T02_E03 {
	public static void main(String[] args) {
		// declarar variables
		double dNum1 = 23.9, dNum2 = 23.2, dNum3 = 23.5;
		double minDdNum1_2;
		double maxDdNum1_2;

		// mostrar resultados
		System.out.println(
				"ceil => dNum1: " + Math.ceil(dNum1) + " dNum2: " + Math.ceil(dNum2) + " dNum3: " + Math.ceil(dNum3));
		System.out.println("floor => dNum1: " + Math.floor(dNum1) + " dNum2: " + Math.floor(dNum2) + " dNum3: "
				+ Math.floor(dNum3));
		System.out.println(
				"rint => dNum1: " + Math.rint(dNum1) + " dNum2: " + Math.rint(dNum2) + " dNum3: " + Math.rint(dNum3));
		System.out.println("round => dNum1: " + Math.round(dNum1) + " dNum2: " + Math.round(dNum2) + " dNum3: "
				+ Math.round(dNum3));
		System.out.println("Máximo: " + Math.max(dNum1, Math.max(dNum2, dNum3)));
		System.out.println("Mínimo: " + Math.min(dNum1, Math.min(dNum2, dNum3)));
	}
}
