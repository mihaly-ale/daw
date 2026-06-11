package exepciones;

public class exceptionesNoComprobadas {

	public static void main(String[] args) {
		try {
//			 System.out.println(7 / 0); // Eclipse no da error (no es un error de compilacion)
			System.out.println("7/3 = " + 7 / 3);
			System.out.println("Sigue programa principal ....");

			int[] iNumeros = { 26, 3, 54 };
			System.out.println(iNumeros[3]); // eclipse no da error, pero al ejecutar si

		} catch (ArithmeticException e) { // maneja el error de 7/0
			System.out.println("\nArithmetic Exception"); 
			System.out.println(" Mensaje " + e.getMessage() + "\ntoString " + e.toString() + "\n");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\nAIOOB ... Exception - fuera del rango"); // why the ...
			System.out.println(" Mensaje " + e.getMessage() + "\n toString " + e.toString() + "\n");
		} catch (Exception e) {
			System.out.println("Exception"); // no ejecuta
			// las excepciones deben ir de la más específica a la más general
			e.printStackTrace();
		} finally {
			System.out.println("Bloque finally.");
		}
		System.out.println("Final del programa.");

	}

}
// excpetions tienen que venir desde mas espicifico a mas especifico
// excpeciones no comprobadas - unchecked errors
// - errores del programador
// - en lugar de manejarlos, deben corregirse