package metodos;

public class metodosSintaxis {

	public static void main(String[] args) {
		System.out.println("--- En el bucle for: ---");
		for (int i = 0; i < 3; i++) {
			System.out.println("Hola desde el bucle for");
		} // final for

		System.out.println();
		System.out.println("--- Empieza tresSaludos() ---");
		tresSaludos();

	} // final main

	// protipo ↓ / void es valor de retorno
	public static void tresSaludos() { // cuerpo de la función
		for (int i = 0; i < 3; i++) {
			System.out.println("Hola de tresSaludos");
		}
	}

} // final class
