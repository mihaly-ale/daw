package ternario;

public class ternario1 {
	public static void main(String[] args) {

		int number = 10;
		String mensaje;

		mensaje = number % 2 == 0 ? "par" : "impar";

		System.out.println("Número es " + mensaje + "."); // muestra variable
		System.out.println("Número es " + (number % 2 == 0 ? "par" : "impar") + "."); // evalúa expresión

	}

}
