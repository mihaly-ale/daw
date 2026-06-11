package tema4_4;

public class UT02_T04_04_E01 {

	public static void main(String[] args) {
		int numero = 5;
		int resultado = suma(numero);
		System.out.println("La suma de 1 hasta " + numero + " es:" + resultado);
		int resultado1 = potencia(numero);
		System.out.println("La potencial de 1 hasta " + numero + " es:" + resultado1);
	}
	
	static int suma(int num) {
		int sum = 0;
		
		if (num == 1) {
			sum = 1;
		} else {
			sum = num + suma(num - 1);
		};
		
		return sum;
	}
	
	static int potencia(int num) {
		int pot = 1;
		
		if (num == 1) {
			 pot = 1;
		} else {
			pot = num * potencia(num -1);
		}
		
		return pot;		
	}
}
