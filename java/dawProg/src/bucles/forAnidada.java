package bucles;

public class forAnidada {

	public static void main(String[] args) {

		int i = 0, j = 0;

		for (; i <= 5; i++) { 
			// i tiene ámbito de local = se puede ver
			
			// j = 0;
			for (; j <= 10; j++) {
				// bucle interno, recorre las columnas
				// cuando i es 0, j va a tomar valores de 0 a 10
				// cuando i es 1, j es 11 => el bucle no corre más
				System.out.println("(" + i + "," + j + ")");
			}

			// salto de línea para terminar cada fila
			System.out.println("* \n");
		}

	}
}
