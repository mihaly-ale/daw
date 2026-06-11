package bucles;

public class forConCondicionCompuesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int  i = 5, j = 6; i + j < 15; i += 1) {
			System.out.println("i=" + i + "\tj=" + j);
			// i toma el valor 9 la ultima vez, la condicón no cumpla (9+6 < 15 es falos), y por eso el bucle termina
		}

	}

}
