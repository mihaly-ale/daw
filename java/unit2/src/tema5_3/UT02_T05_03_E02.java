package tema5_3;

public class UT02_T05_03_E02 {

	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("El programa necesita 3 argumentos.");
			return;
		}

		String operacion = args[0];
		float decimal;
		int entero;

		try {
			decimal = Float.parseFloat(args[1]);
		} catch (NumberFormatException e) {
			System.out.println("El segundo argumento debe ser un float.");
			return;
		}

		try {
			entero = Integer.parseInt(args[2]);
		} catch (NumberFormatException e) {
			System.out.println("El tercer argumento debe ser un entero.");
			return;
		}

		boolean operacionEsValid = operacion.equals("s") || operacion.equals("r") || operacion.equals("m")
				|| operacion.equals("d");

		if (!operacionEsValid) {
			System.out.println("El primer parametro debe ser \"s\", \"r\", \"m\" o \"d\" .");
			return;
		} else {
//			System.out.println("do calc");
			System.out.println(visualizarOperacion(operacion, decimal, entero));
		}

	} // main

	static float visualizarOperacion(String operacion, float decimal, int entero) {
		float resultado = 0.0f;

		switch(operacion) {
		case "s": 
			resultado = decimal + entero;
			break;
		case "r": 
			resultado = decimal - entero;
			break;
		case "m": 
			resultado = decimal * entero;
			break;
		case "d": 
			resultado = decimal / entero;
			break;
		}
		
		return resultado;
	}

}
