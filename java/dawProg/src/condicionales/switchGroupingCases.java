package condicionales;

public class switchGroupingCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;

		switch (num) {
		case 1:
		case 3:
		case 5:
			System.out.println("Impar");
			System.out.println("Es 1, o 3, o 5");
			break;
		case 2:
		case 4:
		case 6: 
			System.out.println("Par");
			System.out.println("Es 1, o 3, o 5");
			break;
		default:
			System.out.println("Otro valor");
			break;
		} // switch
		System.out.println("Final del programa.");

	} // main

}// class
