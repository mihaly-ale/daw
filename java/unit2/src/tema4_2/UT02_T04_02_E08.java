package tema4_2;

import java.util.Scanner;

public class UT02_T04_02_E08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char caracter;
		char temp = ' ';
		
		System.out.print("Teclea un carácter: ");
		caracter = sc.next().charAt(0);
		
		if ((caracter >= 65 && caracter <= 90) || (caracter >= 97 && caracter <= 122) ) {
			 if (caracter <= 90) {
				 // mayuscula
				 temp = (char)(caracter+32);
			 } else {
				 // minuscula
				 temp = (char)(caracter-32);
			 }
			 System.out.println(temp);
		} else if (caracter == '*') {
			System.out.println("fin");
		} else {
			System.out.println(caracter);			
		}		
	}
}
