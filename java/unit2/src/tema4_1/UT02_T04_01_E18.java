package tema4_1;

import java.util.Scanner;

public class UT02_T04_01_E18 {

	public static void main(String[] args) {

		int num1, num2, num3, operacion;
		String resultado = "";

		Scanner scan = new Scanner(System.in);
		System.out.print("Primer numero: ");
		num1 = scan.nextInt();
		System.out.print("Segundo numero: ");
		num2 = scan.nextInt();

		System.out.println("\nElige una operación:");
		System.out.println("1.SUMA\n2.MAYOR_MENOR\n3.INTERVALO");
		operacion = scan.nextInt();

		if (operacion != 1 && operacion != 2 && operacion != 3) {
			System.out.println("Operación no válida!");
			scan.close();
			return;
		} else {
			switch (operacion) {
			case 1:
				resultado = Integer.toString(num1 + num2);
				break;
			case 2:
				resultado = num1 > num2 ? (num1 + " > " + num2)
						: (num1 == num2 ? "Son iguales." : (num1 + " < " + num2));
				break;
			case 3:
				System.out.println("Tercer número:");
				num3 = scan.nextInt();
				resultado = (num3 > Math.min(num1, num2) && num3 < Math.max(num1, num2))
						? "Se encuentra en el intervalo"
						: "No se encuentra en el intervalo";
				break;
			default:
				break;
			}
		}
		scan.close();
		System.out.println(resultado);
	}

}
