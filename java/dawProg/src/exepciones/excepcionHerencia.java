package exepciones;

public class excepcionHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = "La casa es azul";
		try {
			System.out.println(7 / 0);
			System.out.println(cadena.charAt(cadena.length()));
		} catch (Exception e) { // herencia Throwavle Exception etc
			System.out.println("Error: " + e.getMessage()); // still catches the first
		} 
		System.out.println("Final");
	}
}
