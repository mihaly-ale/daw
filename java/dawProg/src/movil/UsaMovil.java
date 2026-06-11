package movil;

public class UsaMovil {

	public static void main(String[] args) {
		Movil simpleMovil = new Movil();
		Movil miMovil = new Movil("Motorola");
		Movil tuMovil = new Movil("iPhone", "17", "gris");
		
		System.out.println("\nsimpleMovil");
		System.out.println(simpleMovil.verCaracteristicas());
		System.out.println("\nmiMovil");
		System.out.println(miMovil.verCaracteristicas());
		System.out.println("\ntuMovil");
		System.out.println(tuMovil.verCaracteristicas());
			
		// Movil miOtroMovil = new Movil("Motorola", "G55");
		// ERROR: The constructor Movil(String, String) is undefined => No existe un constructor que acepte dos argumentos

	}
}
