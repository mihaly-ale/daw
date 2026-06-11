package bucles;

import java.util.Scanner;

public class doWhile {
	public static void main(String[] args) {

		char car; // only *? or +
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Teclea el carácter: ");
			car = sc.next().charAt(0);
		} while (car == '*' || car == '?' || car == '+');
		
		System.out.println(car);
	}
}
