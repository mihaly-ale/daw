package tema4_1;

import java.util.Scanner;

public class UT02_T04_01_E17 {
	public static void main(String[] args) {
		String modelo, color, mensaje;

		Scanner scan = new Scanner(System.in);
		System.out.println("Modelo? ");
		modelo = scan.next().toLowerCase();
		System.out.println("Color? ");
		color = scan.next().toLowerCase();

		switch (modelo.charAt(0)) {
		case 'c':
			switch (color.charAt(0)) {
			case 'a', 'b', 'r':
				mensaje = "disponible";
				break;
			default:
				mensaje = "no disponible";
				break;
			} //fin clio & color
			break;
		case 'm':
			switch (color.charAt(0)) {
			case 'a', 'r':
				mensaje = "Disponible";
				break;
			case 'b':
				mensaje = "No disponible";
				break;
			default:
				mensaje = "Opción no contemplada";
				break;
			} //fin megane & color
			break;
		case 'l':
			switch (color.charAt(0)) {
			case 'a','r':
				mensaje = "No disponible";
				break;
			case 'b':
				mensaje = "Disponible";
				break;
			default:
				mensaje = "Opción no contemplada";
				break;
			}  //fin laguna & color
			break;
		default:
			mensaje = "Opción no contemplada";			
			break;
		} // switch modelo
		
		System.out.println("\n"  + modelo.toUpperCase() +  " en " + color + ": " + mensaje);
		scan.close();
	}// main
}// class
