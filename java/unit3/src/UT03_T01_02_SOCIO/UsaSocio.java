package UT03_T01_02_SOCIO;

public class UsaSocio {

	public static void main(String[] args) {
		Socio miguel = null;

		try {
			miguel = new Socio("Miguel", "11111111g", "923456789", "1233-hjk", "null@gmail.com");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(miguel); // toString

		int numeroDeVisitas = 20;
		for (int i = 0; i < numeroDeVisitas; i++) {
			miguel.registrarVisita();
		}


		for(String logs: Socio.getHistorialCambios()) {
			System.out.println(logs);
		}

	}

}

// DNIs válidos: 00000000T, 11111111H, 99999999R, 94003450s
// DNIs inválidos: 75y, 94003450i
