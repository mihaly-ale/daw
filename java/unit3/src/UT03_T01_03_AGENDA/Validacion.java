package UT03_T01_03_AGENDA;

import java.util.Objects;

public class Validacion {
	
	public static String validarCadenaNuloVacio(String campo, String referencia) {

		Objects.requireNonNull(campo, referencia + " " + Constantes.NULL_MSG ); // fail fast
		
		if (campo.trim().isEmpty())
			throw new IllegalArgumentException(referencia + " " + Constantes.EMPTY_MSG);

		return campo.trim();
	}

}
