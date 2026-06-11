package hashmap;

import java.util.HashMap;

public class hashmapBasico {

	public static void main(String[] args) {

		HashMap<String, Integer> edades = new HashMap<>();

		edades.put("Ana", 23); // calcula hash y guarda en el hasmap
		edades.put("Luis", 30);
		edades.put("Marta", 19);

		System.out.println("Edad de Ana: " + edades.get("Ana"));

		edades.put("Ana", 80);
		System.out.println("Edad de Ana: " + edades.get("Ana")); // cambia, porque no puede guardar el mismo hash

		// check if elemnt is in the array
		if (edades.containsKey("Luis")) {
			System.out.println("\nLuis está en el mapa.");
		}
		
		if (edades.containsValue(30)) {
			System.out.println("Alguien tiene 30 años.\n");
		}
		
		for (String nombre: edades.keySet()) { // devuelva el conjunto de las claces - Array or Set
			System.out.println(nombre + " -> " + edades.get(nombre));
			// el orden depende del hash, se puede especificar pero con nuestro conocimiento no podemos
		}
	}

}

/*

syntax:
	HashMap<key, value> name - new HashmMap<>

methods:
	put - add key/value pairs
	get - return value by key
	remove - delete entry by key
	NOTE: no index (as ArrayList), but key
	
	clear - remove all
	size - only unique keys
	
	this.keySet() - return keys
	values() - return values
*/