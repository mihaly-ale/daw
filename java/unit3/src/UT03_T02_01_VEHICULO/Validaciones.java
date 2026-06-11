package UT03_T02_01_VEHICULO;

import java.util.Objects;




class Validaciones {
	// null check
	public static String comprobarNuloVacio(String texto, String atributo) {
		Objects.requireNonNull(texto,
				atributo.substring(0, 1).toUpperCase() + atributo.substring(1) + " no puede ser null.");

		if (texto.trim().isEmpty() == true) {
			throw new IllegalArgumentException(
					atributo.substring(0, 1).toUpperCase() + atributo.substring(1) + " no puede ser vacio.");
		}

		return texto.trim();

	}

	// matricula check
	public static String validarMatricula(String matricula) {

		if (matricula.matches("^\\d{4}-?[BCDFGHKLMNPRSTVWXYZ]{3}$")) {
		} else if (matricula.matches("^(A|AB|AL|AV|B|BA|BI|BU|C|CA|CC|CE|CO|CR|CS|CU|GC|GI|GR|GU|H|HU|J|L|LE|LO|LU|M|MA|ML|MU|NA|O|OU|P|PM|PO|S|SA|SE|SG|SO|SS|T|TE|TF|TO|V|VA|VI|Z)-?\\d{1,4}-?[BCDFGHKLMNPRSTVWXYZ]{2}$")) {
		} else {
			throw new IllegalArgumentException("Error: matricula invalido.");
		}

		return matricula;
	}
	

}
