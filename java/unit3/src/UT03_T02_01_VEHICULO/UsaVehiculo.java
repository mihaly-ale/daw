package UT03_T02_01_VEHICULO;

public class UsaVehiculo {

	public static void main(String[] args) {

		System.out.println("\nMotocicletas");
		Motocicleta moto1;
		try {
			moto1 = new Motocicleta("9123-BCD", "verde", "Kawasaki Ninja", "125");
			System.out.println(moto1.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("\nCamiones");
		Camion cam1;
		try {
			cam1 = new Camion("B-1-BB", "blanco", "Volvo", "ligero", "10t");
			System.out.println(cam1.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("\nCoches");
		Coche coche1;
		try {
			coche1 = new Coche("5844-LKY", "negro", "Ford Mondeo 2.0TDCI", true, true);
			System.out.println(coche1.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
