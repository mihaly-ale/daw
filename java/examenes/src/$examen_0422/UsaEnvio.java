package $examen_0422;

public class UsaEnvio {

	public static void main(String[] args) {

		Paquete[] paquetes = { new PaqueteNacional("N001", 3.5, 20.0, "Madrid", 2.5),
				new PaqueteInternacional("I001", 2.0, 40.0, "Francia", 0.15, 5.0),
				new PaqueteNacional("N002", 5.0, 25.0, "Barcealona", 2.0),
				new PaqueteInternacional("I002", 10.0, 60.0, "Alemania", 0.20, 4.0),
				new PaqueteNacional("N003", 1.0, 15.0, "Sevilla", 3.0),
				new PaqueteInternacional("I003", 7.5, 50.0, "EEUU", 0.25, 6.0) };

		int numeroPaquetes = 0;
		double totalPaquetes = 0;
		int tramo = 20;
		

		for (int i = 0; i < paquetes.length; i++) {

			numeroPaquetes++;
			totalPaquetes += paquetes[i].calcularCosteEnvio();

			System.out.println(paquetes[i].generarEtiqueta());
			int totalTramos = mostrarTramos(paquetes[i].calcularCosteEnvio(), tramo);
			
			System.out.println("Tramos completos: " + totalTramos);

			System.out.println("--------------------");

		}

		System.out.println("numero total de paq: " + numeroPaquetes);
		System.out.println("coste total acum: " + totalPaquetes);
		System.out.println("coste medio: " + totalPaquetes / numeroPaquetes + " €");

	} // main

	static int mostrarTramos(double importe, int tramo) {

		System.out.println("Tramos: ");

		int num = (int) importe / tramo;

		for (int i = 0; i < num; i++) {
			System.out.println("\tTramo " + (i + 1) + ": " + tramo + "€");
		}

		return num;

	} // mostrarTramos
	
//	static double calcularImpuesto(int tramos, int tramo) {
//		
//		int contador = 1;
//		int impuesto = 0;
//		
//		
//		if (tramos == contador) {
//			tramo += tramo * 0.8 / 100;
//		} else if {
//			for () {
//				
//			} 
//		}
//		
//		
//	}

}
