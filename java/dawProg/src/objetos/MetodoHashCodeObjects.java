package objetos;

public class MetodoHashCodeObjects {

	public static void main(String[] args) {
		String s = "Hola";
		System.out.println(s.hashCode()); // 2255068
		System.out.println("Hola".hashCode()); // 2255068
		System.out.println("hola".hashCode()); // 3208380
		System.out.println(s.concat(" Mundo").hashCode()); // 396251757

		String s1 = new String("Prueba");
		String s2 = new String("Prueba");

		System.out.println(s1 == s2); // false
		// == compara la referencia de objetos, es decir el sitio en la memoría
		System.out.println(s1.equals(s2)); // true
		// el contenido es el mismo

		// colision
		String k1 = "FB";
		String k2 = "Ea";

		System.out.println(k1.hashCode()); // 2236
		System.out.println(k2.hashCode()); // 2236
		// hash colision
		// Para Java NO son iguales!!
		// para que dos objetos sean iguales deben tener el mismo hashCode Y equals()
		// debe devolver true.

	}

}
