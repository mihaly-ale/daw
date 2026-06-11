package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<Integer> numeros= new ArrayList<Integer>();
		ArrayList<Integer> numeros = new ArrayList<>(); // no es necesario especificar el tipo la segunda vez

		System.out.println("numeros vacío: "  + numeros);
		numeros.add(23);
		numeros.add(24);
		numeros.add(25);

		System.out.println("numeros rellenado: "  + numeros);
		System.out.println("numeros.get(2): " + numeros.get(2));
		System.out.println("numeros.size: " + numeros.size());

		System.out.println("\nLog con bucle for, utilizando get() is size()");
		for (int i = 0; i < numeros.size(); i++) {
			System.out.print(" " + numeros.get(i));
		}

		System.out.println("\n\nLog con bucle for each");
		for (Integer numero : numeros) {
			System.out.print(" " + numero);
		}

		System.out.println("\n\nnumeros.contains(5)");
		if (numeros.contains(5)) {
			System.out.println("Econtarado.");
		} else {
			System.out.println("No encontrado.");
		}

		System.out.println("\nAñadir 100 a la 2ᵃ posición con el método add");
		System.out.println(" Numeros size ante de add: " + numeros.size());
		numeros.add(1, 100);
		System.out.println(" Numeros size después de add: " + numeros.size());
		System.out.println(" " + numeros);

		System.out.println("\nset(int index, E element)");
		numeros.set(1, 222);
		System.out.println("numeros.set(1, 222): " + numeros);

		System.out.println("\nremove(int index)");
		numeros.remove(1);
		System.out.println("numeros.remove(1): " + numeros);

		System.out.println("\nnumeros.remove(Integer.valueOf(24))");
		System.out.println("el método remove es sobrecargado: remove(Object o)");
		numeros.remove(Integer.valueOf(24)); // at each position there is an object, not a simple type		
		System.out.println(numeros);

		System.out.println("\nnumeros.clear()");
		numeros.clear();
		System.out.println("numeros: " + numeros + " size: " + numeros.size());
		
		ArrayList<String> nombres2 = new ArrayList<>(Arrays.asList("Bela", "Geza", "Pista"));
	}
}
