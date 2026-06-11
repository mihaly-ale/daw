package metodos;

public class saludosPersonalizados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Pepe";
		variosSaludos(5, str); // paremetros actuales

	}

	public static void variosSaludos(int veces, String str) {
		for (int i = 0; i < veces; i++) {
			System.out.println("Hola " + str);
		}

	} // class
}
