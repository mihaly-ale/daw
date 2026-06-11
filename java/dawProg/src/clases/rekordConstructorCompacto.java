package clases;

enum TipoMatricula {
	MODERNA, // 9999 CCC
	ANTIGUA // D 6576 AS
}

record Matricula(String matricula, TipoMatricula tipo) {
	private static final String LETRAS = "BCDFGHJKLMNPQRSTVWXZ";

	public Matricula { // constructor compacto - generalmente para validación

		// NOTE: 1. Validación
		if (matricula == null || matricula.isBlank())
			throw new IllegalArgumentException("La matricula no puede ser nulo o vacío.");

		// NOTE: 2. Normalización
		matricula = matricula.toUpperCase().replaceAll("[ -]", ""); // quitar caracteres extras
		
		System.out.println("Implementar 'Comprobación validaciones' (moderna, antigua) ...\n");
		
//		this.matricula = matricula; // **
		// => ERROR: Illegal explicit assignment of a final field matricula in compact constructor

	}

};

public class rekordConstructorCompacto {
	public static void main(String[] args) {

		Matricula matr1 = new Matricula("5844-YBR", TipoMatricula.MODERNA);
		
		System.out.println(matr1.matricula()); // 5844YBR
	}
}

// **
// ... the statements this.length = length; and this.width = width; which appear in the canonical constructor do not appear in the compact constructor.
// At the end of a compact constructor, its implicit formal parameters are assigned to the record class's private fields corresponding to its components. 
// https://docs.oracle.com/en/java/javase/17/language/records.html#GUID-6699E26F-4A9B-4393-A08B-1E47D4B2D263