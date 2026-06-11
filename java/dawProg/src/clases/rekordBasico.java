package clases;

record Persona(String nombre, int edad) {
	//POR DEFECTO:
	// Al definir un record, el compilador genera automáticamente:
	// - Una clase final llamada Persona NOTE: final = inmutable 
	/// public class final Persona {}; 
	// - Atributos privados y finales para cada componente (nombre, edad)
	/// private final String nombre, private final int edad;
	// - Un constructor canónico
	/// public Personas (String nombre, int edad){this.nombre = nombre; ...}
	/// NOTE: se puede crear un constructor compacto
	/// public Personas {...} - *signature is implicit*
	// - Métodos getter* con el mismo nombre que cada componente (nombre(), edad())
	/// public String nombre(){return nombre;}
	// - Implementaciones de toString(), equals() y hashCode()
}

public class rekordBasico {

	public static void main(String[] args) {
		Persona p1 = new Persona("Pepe", 20);
		System.out.println(p1.edad()); // de la línea 7
		System.out.println(p1.hashCode());
		System.out.println(p1.toString());
		
		System.out.println("equals: ");
		Persona p2 = p1;
		System.out.println(p1 == p2); // memory equality => true (same as in an Object **)
		// ***
		//    ↓↓↓
		System.out.println(p1.equals(p2));
		
		Persona p3 = new Persona("Pepe", 20);
		System.out.println(p1.equals(p3)); // *** 
		System.out.println(p1 == p3); // memory check: p3 is created with new, so it is a totally new object, hence it is => FALSE
		

	}

}

//* public accessor method
// Importante: NO genera setters porque los records son inmutables

// ** NOTE: package java.lang.Object.class; 
// public boolean equals(Object obj) {
// 		return (this == obj);
// }


// ***
// Override
//public boolean equals(Object o) {
//    if (this == o) return true;
//    if (!(o instanceof Persona other)) return false;
//    return Objects.equals(nombre, other.nombre) && edad == other.edad;
//}