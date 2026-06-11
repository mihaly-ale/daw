package tipos;

public class castATP1 {
	public static void main(String[] args) {

		byte a = 1;
		byte b = 3;
		// byte c = a + b; // => ERROR
		// Type mismatch: cannot convert from int to byte

		// UN VALOR DE TIPO INT (4 BYTES) NO CABE EN UN BYTE (1 BYTE)

		/* @formatter:off
		byte cc = a + (byte)b; => ERROR
		- el casting tampoco ayuda 
		Automatic Type Promotion: en una operación aritmética en Java,
		los operadores más pequeños que int se convierten a int
		durante la operación. => a es todavía un int y b tambien
		orden:
				1. cast b
				2. a a int (Automatic Type Promotion)
				3. b a int 
				4. adición: int + int
				5. ERROR
	 	@formatter:on */

		byte ccc = (byte) (a + b); // orden: suma y casting

		System.out.println(ccc); // 4
	}
}
