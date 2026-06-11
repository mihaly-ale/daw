package tema4_4;

public class UT02_T04_04_E02 {

	public static void main(String[] args) {

		int numero = 12345;
		int cantidadRe = contarDigitosRecrusivo(numero);
		int cantidadBu = contarDigitosConBucle(numero);
		System.out.println("Recursivo: El número " + numero + " tiene " + cantidadRe + " dígitos");
		System.out.println("Bucle: El número " + numero + " tiene " + cantidadBu + " dígitos");
	}

	public static int contarDigitosRecrusivo(int num) {

		if (num >= 10) {
			return 1 + contarDigitosRecrusivo(num / 10);
		} else {
			return 1;
		}

	}

	public static int contarDigitosConBucle(int num) {
		int contador = 0;

		while (num > 0) {
			num = num / 10; // quitar el último dígito
			contador++; // quie quiero aumentar en cada iteración
		}

		return contador;
	}

}
