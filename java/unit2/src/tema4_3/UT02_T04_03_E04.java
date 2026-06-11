package tema4_3;

public class UT02_T04_03_E04 {
	
	public static int cuadrado (int valor) {
		return valor * valor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 50;
		int numTotal = 0;

		System.out.println("z x y");
		System.out.println("-----");
			for (int z = 1; z <= numero; z++) {
				
			for (int x = 1; x < numero; x++) {
				for (int y = 1; y < numero; y++) {
					
					if (cuadrado(z) == cuadrado(x) + cuadrado(y)) {
						System.out.println(z + " " + x + " " + y);
						numTotal++;
					}					
				}}
			}
			System.out.println(numero);
			System.out.println("Número total de elemntos: " + numTotal);
	}
}
