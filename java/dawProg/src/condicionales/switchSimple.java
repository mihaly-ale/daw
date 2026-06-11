package condicionales;

public class switchSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;

		switch (num) { // evaula expresión
		case 1: {
			System.out.println("Valor 1");
			break;
		}
		case 2: {
			System.out.println("Valor 2");
			break;
		}
		default:
			System.out.println("Otro valor");
			break;// break en default es opcional
				  // (puede ir al principio, así que debe poner)
		} // switch

		System.out.println("Final del programa.");

	} // main

}// class
