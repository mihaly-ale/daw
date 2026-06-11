package UT03_T02_01_VEHICULO;

enum TipoMatricula {
	MODERNA, // 9999 CCC
	ANTIGUA // D 6576 AS
}

record Matricula(String matricula, TipoMatricula tipo) {
	private static final String LETRAS = "BCDFGHJKLMNPQRSTVWXZ";

	public Matricula { // constructor compacto

		if (matricula == null || matricula.isBlank())
			throw new IllegalArgumentException("La matricula no puede ser nulo o vaciío.");

		matricula = matricula.toUpperCase().replaceAll("[ -]", ""); // quita caracteres extras

		if (matricula.matches("\\d{4}[A-Z]{3}")) {
			String letras = matricula.substring(4); // e quedo con las letras para validar más
		} else {
			throw new IllegalArgumentException("La matr debe ser NNNNLLL");
		}

	}

};

public class rekord {

}
