package $examen_1203;

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
}

public class pruebas {
	public static void main(String[] args) {

		Personaje[] equipo = { new Guerrero(), new Mago(), new Guerrero(), new Mago(), new Guerrero() };

		int numGuer = 0;
		int numMago = 0;
		for (Personaje p : equipo) {

			if (p instanceof Guerrero) {
				numGuer++;
			} else
				numMago++;

		}

		System.out.println("numero de guerreos: " + numGuer);
		System.out.println("numero de magos: " + numMago);

		Scanner sc = new Scanner(System.in);

		System.out.print("Selecciona un personaje: ");
		int num;
		num = sc.nextInt();

		for (int i = 0; i < equipo.length - 1; i++) {

			if (i == num - 1) {

				((Mago) equipo[i]).lanzarHechizo();
			}

		}

	}
}
