package condicionales;

public class switchWithChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char num = 'n';

		switch (num) {
		case 'n':
		case 'N':
		case 's':
		case 'S':
		case 5: // evalua, porque Java alamacena tipo char como un número entero de 16-bit
			System.out.println("Entrada válida");
			break;
		default:
			System.out.println("Otro valor");
			break;
		} // switch
		System.out.println("Final del programa.");

	} // main

}// clase