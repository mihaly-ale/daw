package tema4_1;

import java.util.Scanner;

public class UT02_T04_01_E07 {
	public static void main(String[] args) {

		float precioPerKm = 0.10f;
		float total;

		Scanner sc = new Scanner(System.in);
		System.out.println("Teclea la distancia del viaje: ");
		int distancia = sc.nextInt();
		System.out.println("Indica si el cliente quiere litera: ");
		String quiereLitera = sc.next();
		System.out.println((quiereLitera.equals("si")));

		if ((quiereLitera.equals("si")))
			total = precioPerKm * distancia + 16;
		else
			total = precioPerKm * distancia;

		//
		System.out.println("		Red de Ferrocarriles de ...");
		System.out.println("---------------------------------------------");
		System.out.println("Concepto Cantidad a abonar");
		System.out.print("Distancia (Kms.) ");
		System.out.println(distancia);
		System.out.print("Litera ");
		System.out.println((quiereLitera.equals("si")) ? ("16 euros") : ("0 euros"));
		System.out.println("---------------------------------------------");
		System.out.print("Total ");
		System.out.println(total + " euros.");
	}
}
