package $examen_1203_redo;

import java.util.Arrays;
import java.util.Scanner;

class Personaje {
	public void atacar() {
		System.out.println("El personaje ataca.");
	}
}// Personaje

class Guerrero extends Personaje {

	@Override
	public void atacar() {
		System.out.println("El guerrero ataca con su espada.");
	}

	public void modoFuria() {
		System.out.println("El guerrero entra en modo furia y duplica su fuerza.");
	}
}// Guerrero

class Mago extends Personaje {

	@Override
	public void atacar() {
		System.out.println("El mago lanza un hechizo de ataque mágico.");
	}

	public void lanzarHechizo() {
		System.out.println("El mago lanza un hechizo especial.");
	}
}// Mago

class polimorfismoGueMago {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Longitud de array 'personajes': ");

		Personaje[] personajes = new Personaje[sc.nextInt()];

		int i = 0;
		while (i < personajes.length) {
			System.out.print("Añadir personaje (m, g): ");
			String clase = sc.next();
			addPersonaje(personajes, clase, i);
			i++;

			if (personajes.length == i) {
				System.out.println("array de personajes construido. Exit.\n");
			}
		}

		int numG = 0;
		int numM = 0;
		for (int j = 0; j < personajes.length; j++) {

			if (personajes[j] instanceof Guerrero) {
				numG++;
				System.out.println(j + 1 + "." + " Guerrero");
			} else {
				System.out.println(j + 1 + "." + " Mago");
				numM++;
			}
		}
		
		System.out.println("Numero de Geuerroes:" + numG);
		System.out.println("Numero de Magos:" + numM);

		System.out.println("Seleciona un personaje: ");
		int personajeSeleccionada = sc.nextInt()-1;
		personajes[personajeSeleccionada].atacar();

	}

	private static void addPersonaje(Personaje[] personajes, String clase, int i) {

		if (clase.equals("m")) {

			personajes[i] = new Mago();
			i++;
		} else if (clase.equals("g")) {

			personajes[i] = new Guerrero();
			i++;
		} else {
			System.out.println("Personaje no existe.");
		}
	}
}
