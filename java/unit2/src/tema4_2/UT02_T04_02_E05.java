package tema4_2;

public class UT02_T04_02_E05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rango = 50;
		int numeroRnd;
		int menorNum = 0;
		int majorNum = 0;
		int temp = 0;
		int suma = 0;

		System.out.println(rango + " números aleatorios entre 100 y 199: ");
		for (int i = rango; i >= 1; i--) {

			numeroRnd = (int) (Math.random() * 99 + 100);
			suma += numeroRnd;
			System.out.print(numeroRnd + " ");

			if (i == (rango-1)) {
				menorNum = numeroRnd;
			} else if (i == (rango -2)) {
				majorNum = numeroRnd;
				if (menorNum > majorNum) { // 190 > 175
					temp = menorNum; // temp es 190
					menorNum = majorNum; // menorNum es 175
					majorNum = temp; // majorNum es 190
				}
			} else {
				if (numeroRnd < menorNum) {
					menorNum = numeroRnd;
				}
				if(numeroRnd > majorNum) {
					majorNum = numeroRnd;
				}
			}

		}
		System.out.println("\n");
		System.out.println("Máximo: " + majorNum );
		System.out.println("Minimo: " + menorNum );
		System.out.println("Media: " + (suma/rango) );
		

	}
}
