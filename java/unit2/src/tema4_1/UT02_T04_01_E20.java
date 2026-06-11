package tema4_1;

public class UT02_T04_01_E20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numRandPica, numRandCarta;
		String pica="", carta="";

		numRandPica = (int) (Math.random() * 4) + 1;
		numRandCarta = (int) (Math.random() * 13) + 1;

		switch (numRandPica) {
		case 1:
			pica = "Picas";
			break;
		case 2:
			pica = "Corazones";
			break;
		case 3:
			pica = "Diamentes";
			break;
		case 4:
			pica = "Tréboles";
			break;
		}
		
		switch (numRandCarta) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			carta = Integer.toString(numRandCarta);
			break;
		case 11:
			carta = "J";
			break;
		case 12:
			pica = "Q";
			break;
		case 13:
			pica = "K";
			break;
		case 1:
			carta = "A";
			break;
		}
		System.out.println(pica);
		System.out.println(carta);
	}

}
