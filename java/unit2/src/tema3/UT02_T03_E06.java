package tema3;

public class UT02_T03_E06 {

	public static void main(String[] args) {

		int x = 20, y = 3;
		String sCadena = "prueba ";

		System.out.println(x + y);            // 20 + 3 = 23
		System.out.println(sCadena + x + y);  // concat de izquierda a derecha => prueba 203 
		System.out.println(x + y + sCadena);  // x + y (resta) + concat SCadena => 23prueba
		System.out.println(x + sCadena + y);  // todo concat => 20Prueba 3

	}
}
