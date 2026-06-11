package comparable;

import java.util.Arrays;

class Persona2003 implements Comparable<Persona2003> {
	private String nombre;
	private int edad;

	public Persona2003(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override // Comparable.compareTo()
	public int compareTo(Persona2003 o) {
//		return Integer.compare(this.edad, o.edad); // *
		return this.nombre.compareTo(o.nombre); // **
	}

	@Override
	public String toString() {
		return "Persona2003 [nombre=" + nombre + ", edad=" + edad + "]";
	}
}

public class Comparable1 {

	public static void main(String[] args) {
		// reqs de ejercicio
//		int[] numeros = { 7, 9, 2, 8, 4 };
//
//		System.out.println(Arrays.toString(numeros));
//
//		Arrays.sort(numeros);
//		System.out.println(Arrays.toString(numeros));

		// SEE AN INTERFACE IN JAVA
		// with the class Persona2003 from here

		Persona2003[] personas = { new Persona2003("Ana", 30), new Persona2003("Marta", 20),
				new Persona2003("Luis", 25) };

		System.out.println(Arrays.toString(personas));
		Arrays.sort(personas);
		// sin Comparable ERROR: java.lang.ClassCastException: no Comparable
		/// NOTE: Java implementa => personas[i].compareTo(personas[j]);
		
		System.out.println(Arrays.toString(personas));
	}

}

// * INTEGER
//public static int compare(int x, int y)
//
//Compares two int values numerically. The value returned is identical to what would be returned by:
//
//Integer.valueOf(x).compareTo(Integer.valueOf(y))

// ** STRING
//public int compareTo(String anotherString)
//
//Compares two strings lexicographically. The comparison is based on the Unicode value of each character in the strings. The character sequence represented by this String object is compared lexicographically to the character sequence represented by the argument string. The result is a negative integer if this String object lexicographically precedes the argument string. The result is a positive integer if this String object lexicographically follows the argument string. The result is zero if the strings are equal; compareTo returns 0 exactly when the equals(Object) method would return true. 
