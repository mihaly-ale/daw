package condicionales;

public class switchNoBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;

		switch (num) { // evaula expresión
		case 1: {
			System.out.println("Valor 1");
		}
		case 2: {
			System.out.println("Valor 2");
		}
		default:
			System.out.println("Otro valor");
		} // switch
		
		System.out.println("Final del programa.");
	} // main

}// class