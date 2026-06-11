package UT03_T01_01_COCHE;

public class UsaCoche {

	public static void main(String[] args) {

		Coche renault = new Coche();
		Coche peugeot = new Coche();
		Coche ford = new Coche("verde",false, true);
		
		peugeot.setAsientosCuero("si");
		peugeot.setClimatizador("si");
		
		renault.setColor("Amarillo");
		
	
		System.out.println("renault:(Coche)\n" + renault.dimeDatosGenerales());
		System.out.println("peugeot:(Coche)\n" + peugeot.dimeDatosGenerales());
		
		
		System.out.println("ford:(Coche)\n" + ford.dimeDatosGenerales());
		ford.setAsientosCuero("si");
		System.out.println("ford:(Coche)\n" + ford.dimeDatosGenerales());
	}

}
