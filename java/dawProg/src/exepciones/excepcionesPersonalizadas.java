package exepciones;

import java.io.IOException;

public class excepcionesPersonalizadas {

	public static void main(String[] args) {

		try {
			leerNumero("Intro un numero .... ");
		} catch (RangoInvalidoExcpetion e) {
			System.out.println(e.toString()); // NOTE: error handling
		}
	} // main

	public static void leerNumero(String texto) throws RangoInvalidoExcpetion {
		int miNumero = 0; // here a scan TODO

		if (miNumero != 0) {
			if ((miNumero > -20 && miNumero < -5) || (miNumero < 20 && miNumero > 10)) {
				System.out.println("Valido ...");
				System.out.println(7 / miNumero);
			}
		} else {
			throw new RangoInvalidoExcpetion(": no se permite dividir."); // add message
		}

	} // leerNumero
}

class RangoInvalidoExcpetion extends Exception {
	public RangoInvalidoExcpetion(String mensaje) {
		super(mensaje);
		System.out.println(mensaje);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + this.getMessage();
	}

}


/*
throw  = runtime action: actually sends the exception
throws = compile-time declaration: says the method may send exceptions upward
         ↪ if not handled here, it goes to the caller

catch  = handles the exception when it arrives
*/